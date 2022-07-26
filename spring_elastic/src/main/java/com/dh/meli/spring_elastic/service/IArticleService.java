package com.dh.meli.spring_elastic.service;

import com.dh.meli.spring_elastic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArticleService {
    Article save (Article article);
    Article findById(int id);
    String deleteById(int id);
    List<Article> findAll();
    Article updateArticle(Article article);
    Page<Article> getPageByTitle(String title, Pageable pg);
}
