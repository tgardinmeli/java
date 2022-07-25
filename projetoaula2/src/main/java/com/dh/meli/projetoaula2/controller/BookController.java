package com.dh.meli.projetoaula2.controller;

import com.dh.meli.projetoaula2.model.Book;
import com.dh.meli.projetoaula2.repository.BookRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepo repo;

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable long id){
        return ResponseEntity.ok(repo.findById(id).get());
    }
}
