package com.dh.meli.spring_elastic.controller;

import com.dh.meli.spring_elastic.model.Article;
import com.dh.meli.spring_elastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService service;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article article){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(article));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable int id){
        return ResponseEntity.ok(service.findById(id));
    }
}
