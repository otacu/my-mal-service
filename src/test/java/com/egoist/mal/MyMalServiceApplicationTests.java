package com.egoist.mal;

import com.alibaba.fastjson.JSON;
import com.egoist.mal.dao.AnimeMapper;
import com.egoist.mal.elasticsearch.document.AnimeDoc;
import com.egoist.mal.elasticsearch.repository.AnimeRepository;
import com.egoist.mal.pojo.Anime;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyMalServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private AnimeMapper animeMapper;

	@Test
	public void testMybatis(){
		Anime anime = animeMapper.selectByPrimaryKey(1859L);
        log.info(JSON.toJSONString(anime));
	}

	@Autowired
	private AnimeRepository animeRepository;

	@Test
	public void testSpringDataElasticsearch(){
		AnimeDoc animeDoc = new AnimeDoc();
		animeDoc.setAnimeId(7);
		animeDoc.setEnName("Witch Hunter Robin");
		animeDoc.setJpName("Witch Hunter ROBIN");
		animeDoc.setPic("https://cdn.myanimelist.net/images/anime/1796/91065.jpg");
		animeDoc.setAnimeType("TV");
		animeDoc.setEpisodes(26);
		animeDoc.setPremiered("Summer 2002");
		animeDoc.setProducers("Bandai Visual");
		animeDoc.setStudios("Sunrise");
		animeDoc.setSource("Original");
		animeRepository.save(animeDoc);
	}
}
