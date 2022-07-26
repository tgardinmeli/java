package com.dh.meli.spring_elastic.controller;

import com.dh.meli.spring_elastic.model.Article;
import com.dh.meli.spring_elastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping()
    public ResponseEntity<List<Article>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteById( @PathVariable int id){
        return ResponseEntity.ok(service.deleteById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Article> updateArticle(@RequestBody Article article){
        return ResponseEntity.ok(service.updateArticle(article));
    }

    @GetMapping("/title/{title}")
    public Page<Article> getPageByTitle(@PathVariable String title, Pageable pg){
        return service.getPageByTitle(title, pg);
    }
}
