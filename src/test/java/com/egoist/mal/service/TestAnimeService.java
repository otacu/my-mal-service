package com.egoist.mal.service;

import com.alibaba.fastjson.JSON;
import com.egoist.parent.pojo.dto.EgoistPagingResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAnimeService {

    @Autowired
    private AnimeService animeService;

    @Test
    public void testQueryPaging() {
        EgoistPagingResult pagingResult = animeService.queryPaging(1, 10);
        log.info(JSON.toJSONString(pagingResult));
    }
}
