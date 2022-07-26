package com.dh.meli.spring_elastic.service;

import com.dh.meli.spring_elastic.model.Article;
import com.dh.meli.spring_elastic.repository.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class ArticleService implements IArticleService{
    @Autowired
    private  ArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }

    @Override
    public Article findById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        repo.deleteById(id);
        return "Objeto deletado com sucesso!";
    }

    @Override
    public List<Article> findAll() {
//        List<Article> list = new ArrayList<>();
//        Iterable<Article> resp = repo.findAll();
//        resp.forEach(list::add);

        return repo.findAllArticle();
    }

    @Override
    public Article updateArticle(Article article) {
        Article articleExistente = findById(article.getId());
        if(articleExistente != null){
            return repo.save(article);
        }
        return null;
    }

    @Override
    public Page<Article> getPageByTitle(String title, Pageable pg) {
        return repo.findByTitle(title,pg);
    }
}
