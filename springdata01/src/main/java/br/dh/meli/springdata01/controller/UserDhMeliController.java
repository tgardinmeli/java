package br.dh.meli.springdata01.controller;

import br.dh.meli.springdata01.model.UserDhMeli;
import br.dh.meli.springdata01.service.UserDhMeliService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        //usar get no optional para pegar o usuário
        //UserDhMeli user = service.getUserById(id).get();

        //recebe um optional
        Optional<UserDhMeli> user = service.getUserById(id);

        if(user.isPresent()){
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/create")
    public ResponseEntity<UserDhMeli> createUser(@RequestBody UserDhMeli userDhMeli){
        return  ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(userDhMeli));
    }

    @PutMapping("/update")
    public ResponseEntity<UserDhMeli> updateUser(@RequestBody UserDhMeli userDhMeli){
        return ResponseEntity.ok(service.updateUser(userDhMeli));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable long id){
        Optional<UserDhMeli> user = service.getUserById(id);
        if(user.isPresent()){
            service.deleteUserById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
