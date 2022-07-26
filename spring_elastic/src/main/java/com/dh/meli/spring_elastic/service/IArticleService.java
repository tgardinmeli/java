package com.dh.meli.spring_elastic.service;

import com.dh.meli.spring_elastic.model.Article;

public interface IArticleService {
    Article save (Article article);
    Article findById(int id);
}
