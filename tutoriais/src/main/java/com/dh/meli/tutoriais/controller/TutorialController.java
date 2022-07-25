package com.dh.meli.tutoriais.controller;

import com.dh.meli.tutoriais.mensagemDto.MensagemDto;
import com.dh.meli.tutoriais.model.Tutorial;
import com.dh.meli.tutoriais.service.TutorialService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {

    @Autowired
    TutorialService service;

    @GetMapping("{id}")
    public ResponseEntity<Tutorial> getById(@PathVariable long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<Tutorial> cadastrarTutorial(@RequestBody Tutorial tutorial){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarTutorial(tutorial));
    }

    @GetMapping
    public ResponseEntity<List<Tutorial>> getAllTutorials(){
        return ResponseEntity.ok(service.getAllTutorials());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MensagemDto> deleteTutorial(@PathVariable long id){
        return ResponseEntity.ok(service.deleteTutorial(id));
    }

    @DeleteMapping
    public ResponseEntity<MensagemDto> deleteAllTutorials(){
        return ResponseEntity.ok(service.deleteAllTutorials());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable long id, @RequestBody Tutorial tutorial){
        return ResponseEntity.ok(service.updateTutorial(id, tutorial));
    }

    @GetMapping("/published")
    public ResponseEntity<List<Tutorial>> getPublished(){
        return ResponseEntity.ok(service.getPublished("Publicado"));
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Tutorial>> getAllFilterTitle(@RequestParam String titulo){
        return ResponseEntity.ok(service.getFilterTitle(titulo));
    }
}
