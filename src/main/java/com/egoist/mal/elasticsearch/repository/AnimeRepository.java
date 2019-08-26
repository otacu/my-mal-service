package com.egoist.mal.elasticsearch.repository;

import com.egoist.mal.elasticsearch.document.AnimeDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;


@Component
public interface AnimeRepository extends ElasticsearchRepository<AnimeDoc, Integer> {

}
