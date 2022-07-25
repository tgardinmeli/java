package com.dh.meli.projetoaula2.controller;

import com.dh.meli.projetoaula2.dto.AuthorDto;
import com.dh.meli.projetoaula2.model.Author;
import com.dh.meli.projetoaula2.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepo repo;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable long id){
        return ResponseEntity.ok(repo.findById(id).get());
    }

    @GetMapping("/dto/{id}")
    public ResponseEntity<AuthorDto> getAuthorDto(@PathVariable long id){
        return ResponseEntity.ok(repo.getById(id));
    }

    @GetMapping("/native/{id}")
    public ResponseEntity<Author> getAuthorNative(@PathVariable long id){
        return ResponseEntity.ok(repo.getNativeById(id));
    }

    @GetMapping("/eag/{id}")
    public ResponseEntity<Author> getAuthorEagle(@PathVariable long id){
        return ResponseEntity.ok(repo.getEagleById(id));
    }
}
