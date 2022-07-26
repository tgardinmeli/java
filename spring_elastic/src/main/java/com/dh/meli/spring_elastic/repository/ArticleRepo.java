package com.dh.meli.spring_elastic.repository;

import com.dh.meli.spring_elastic.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {
}
