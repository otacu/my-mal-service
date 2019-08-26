package com.egoist.mal.elasticsearch.service;

import com.egoist.mal.elasticsearch.document.AnimeDoc;
import com.egoist.mal.elasticsearch.mapper.HighLightResultMapper;
import com.egoist.mal.elasticsearch.repository.AnimeRepository;
import com.egoist.mal.pojo.Anime;
import com.egoist.mal.service.AnimeService;
import com.egoist.parent.common.constants.EgoistResultStatusConstants;
import com.egoist.parent.pojo.dto.EgoistPagingResult;
import com.egoist.parent.pojo.dto.EgoistResult;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AnimeDocService {

    @Autowired
    private AnimeService animeService;

    @Autowired
    private AnimeRepository animeRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private HighLightResultMapper highLightResultMapper;

    /**
     * 重建anime索引。因为这样太慢了所以改用logstash从mysql导入elasticsearch
     *
     * @return
     */
    @Deprecated
    public EgoistResult saveAll() {
        int pageNum = 1;
        int pageSize = 100;
        boolean hasNextPage = true;
        do {
            EgoistPagingResult pagingResult = animeService.queryPaging(pageNum, pageSize);
            if (!EgoistResult.isOk(pagingResult)) {
                return pagingResult;
            }
            List<Anime> list = (List<Anime>) pagingResult.getData();
            pageNum = pagingResult.getNextPage();
            hasNextPage = pagingResult.getHasNextPage();
            list.forEach(anime -> {
                AnimeDoc animeDoc = this.convert(anime);
                animeRepository.save(animeDoc);
            });
        } while (hasNextPage);
        return EgoistResult.ok();
    }

    private AnimeDoc convert(Anime anime) {
        AnimeDoc animeDoc = new AnimeDoc();
        animeDoc.setAnimeId(anime.getAnimeId());
        animeDoc.setEnName(anime.getEnName());
        animeDoc.setJpName(anime.getJpName());
        animeDoc.setPic(anime.getPic());
        animeDoc.setAnimeType(anime.getType());
        animeDoc.setEpisodes(anime.getEpisodes());
        animeDoc.setPremiered(anime.getPremiered());
        animeDoc.setProducers(anime.getProducers());
        animeDoc.setStudios(anime.getStudios());
        animeDoc.setSource(anime.getSource());
        return animeDoc;
    }

    /**
     * 在日文名中搜索
     *
     * @param name 字段名
     * @param text 搜索文本
     * @return
     */
    public EgoistResult search(String name, String text) {
        try {
            int currentPage = 0;
            int pagesize = 10;
            Pageable pageable = PageRequest.of(currentPage, pagesize);
            QueryBuilder queryBuilder = QueryBuilders.boolQuery()
                    .must(QueryBuilders.matchQuery(name, text));
            SearchQuery searchQuery = new NativeSearchQueryBuilder()
                    .withQuery(queryBuilder)
                    .withPageable(pageable)
                    .withHighlightFields(new HighlightBuilder.Field(name).preTags("<span style=\"color:orange\">").postTags("</span>"))
                    .build();
            Page<AnimeDoc> docPage = elasticsearchTemplate.queryForPage(searchQuery, AnimeDoc.class, highLightResultMapper);
            return EgoistResult.ok(docPage.getContent());
        } catch (Exception e) {
            log.error("搜索异常", e);
            return new EgoistResult(EgoistResultStatusConstants.STATUS_400, "搜索异常", null);
        }
    }
}
