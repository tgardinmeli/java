package br.dh.meli.springdata01.controller;

import br.dh.meli.springdata01.model.UserDhMeli;
import br.dh.meli.springdata01.service.UserDhMeliService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserDhMeliController {

    @Autowired
    private UserDhMeliService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserDhMeli> getId(@PathVariable long id){
        UserDhMeli user = service.getUserById(id);
        if(user != null){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }
}
