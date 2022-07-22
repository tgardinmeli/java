package br.dh.meli.springdata01.controller;

import br.dh.meli.springdata01.model.UserDhMeli;
import br.dh.meli.springdata01.service.UserDhMeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserDhMeliController {

    @Autowired
    private UserDhMeliService service;

    @GetMapping
    public ResponseEntity<List<UserDhMeli>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDhMeli> getId(@PathVariable long id){
        return ResponseEntity.ok(service.getUserById(id));
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<UserDhMeli> getByEmail(@PathVariable String email){
        return ResponseEntity.ok(service.getByEmail(email));
    }

    @PostMapping("/create")
    public ResponseEntity<UserDhMeli> createUser(@RequestBody UserDhMeli userDhMeli){
        return  ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(userDhMeli));
    }

    @PutMapping("/update")
    public ResponseEntity<UserDhMeli> updateUser(@RequestBody UserDhMeli userDhMeli){
        return ResponseEntity.ok(service.updateUser(userDhMeli));
    }

    @PatchMapping ("/update/{id}")
    public ResponseEntity<UserDhMeli> updateUserParcial(@PathVariable long id, @RequestBody Map<String, String> changes){
        return ResponseEntity.ok(service.updateParcial(id, changes));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable long id){
        service.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }


}
