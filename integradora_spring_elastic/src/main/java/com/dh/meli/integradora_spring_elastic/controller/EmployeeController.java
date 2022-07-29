package com.dh.meli.integradora_spring_elastic.controller;

import com.dh.meli.integradora_spring_elastic.model.Employee;
import com.dh.meli.integradora_spring_elastic.service.EmployeeService;
import com.dh.meli.integradora_spring_elastic.service.IEmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService service;

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveEmployee(employee));
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getById(@PathVariable String id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

}
