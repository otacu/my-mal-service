package com.egoist.mal.service;

import com.egoist.mal.dao.AnimeMapper;
import com.egoist.mal.pojo.Anime;
import com.egoist.mal.pojo.AnimeExample;
import com.egoist.parent.common.constants.EgoistResultStatusConstants;
import com.egoist.parent.pojo.dto.EgoistPagingResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AnimeService {

    @Autowired
    private AnimeMapper animeMapper;

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public EgoistPagingResult queryPaging(Integer pageNum, Integer pageSize) {
        EgoistPagingResult pagingResult = new EgoistPagingResult();
        try {
            AnimeExample animeExample = new AnimeExample();
            PageHelper.startPage(pageNum, pageSize);
            List<Anime> list = animeMapper.selectByExample(animeExample);
            PageInfo<Anime> pageInfo = new PageInfo<Anime>(list);
            pagingResult.setPageNum(pageInfo.getPageNum());
            pagingResult.setPageSize(pageInfo.getPageSize());
            pagingResult.setTotalCount(pageInfo.getTotal());
            pagingResult.setTotalPageNum(pageInfo.getPages());
            pagingResult.setFirstPage(pageInfo.isIsFirstPage());
            pagingResult.setLastPage(pageInfo.isIsLastPage());
            pagingResult.setHasPrePage(pageInfo.isHasPreviousPage());
            pagingResult.setHasNextPage(pageInfo.isHasNextPage());
            pagingResult.setPrePage(pageInfo.getPrePage());
            pagingResult.setNextPage(pageInfo.getNextPage());
            pagingResult.setStatus(EgoistResultStatusConstants.STATUS_200);
            pagingResult.setData(pageInfo.getList());
        } catch (Exception e) {
            pagingResult.setStatus(EgoistResultStatusConstants.STATUS_400);
            pagingResult.setMsg("查询动画异常");
            log.error("查询动画异常", e);
        }
        return pagingResult;
    }
}
