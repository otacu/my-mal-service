package com.egoist.mal.elasticsearch.service;

import com.alibaba.fastjson.JSON;
import com.egoist.mal.elasticsearch.document.AnimeDoc;
import com.egoist.parent.pojo.dto.EgoistResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAnimeDocService {

    @Autowired
    private AnimeDocService animeDocService;

    @Test
    public void testSaveAll() {
        animeDocService.saveAll();
    }

    @Test
    public void search() {
        EgoistResult result = animeDocService.search("jpName", "新世紀");
//        EgoistResult result = animeDocService.search("pic", "jpg");
//        EgoistResult result = animeDocService.search("animeType", "TV");
        List<AnimeDoc> list = (List<AnimeDoc>) result.getData();
        log.info(JSON.toJSONString(list));
    }
}
