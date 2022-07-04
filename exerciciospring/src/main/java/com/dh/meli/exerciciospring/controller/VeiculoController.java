package com.dh.meli.exerciciospring.controller;

import com.dh.meli.exerciciospring.model.Veiculo;
import com.dh.meli.exerciciospring.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    VeiculoRepo repo;


    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> pesquisaVeiculo(@PathVariable String placa){
        Veiculo v = repo.getVeiculo(placa);
        return ResponseEntity.ok(repo.getVeiculo(placa));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Veiculo>> getAll(){
        List<Veiculo> veiculos = repo.getAll();
        return ResponseEntity.ok(veiculos);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveVeiculo(@RequestBody Veiculo veiculo){
        repo.saveVeiculo(veiculo);
    }


}
