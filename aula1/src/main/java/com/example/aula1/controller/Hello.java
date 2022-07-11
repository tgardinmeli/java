package com.example.aula1.controller;


import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Hello {


    @GetMapping("/ola/{nome}/{id}")
    public String digaOi(@PathVariable String nome, @PathVariable int id){

        return "Olá" + nome + ":" + id;
    }

    @GetMapping("/ola")
    public String digaOiDificil(@RequestParam String nome){
        return "oii " + nome + " esse é o método chatinho de fazer requisição";
    }

    @PostMapping
    public ResponseEntity<User> getUser(@RequestBody User user){
        return  new ResponseEntity(user, HttpStatus.BAD_REQUEST);
    }

}
