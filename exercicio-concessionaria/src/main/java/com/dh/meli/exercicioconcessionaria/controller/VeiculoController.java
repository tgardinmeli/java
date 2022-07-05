package com.dh.meli.exercicioconcessionaria.controller;


import com.dh.meli.exercicioconcessionaria.model.Veiculo;
import com.dh.meli.exercicioconcessionaria.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/veiculos/")
public class VeiculoController {
    @Autowired
    VeiculoRepo repo;

    @GetMapping
    public ResponseEntity<Veiculo> getVeiculo(String placa){
        return ResponseEntity.ok(repo.getVeiculo(placa));
    }
}
