package com.dh.meli.exerciciospring.controller;

import com.dh.meli.exerciciospring.dto.VeiculoDto;
import com.dh.meli.exerciciospring.model.Veiculo;
import com.dh.meli.exerciciospring.repository.VeiculoRepo;
import com.dh.meli.exerciciospring.service.VeiculoService;
import com.dh.meli.exerciciospring.service.VeiculoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/veiculo")
public class VeiculoController {
    @Autowired
    VeiculoService service;


    @GetMapping("/{placa}")
    public ResponseEntity<VeiculoDto> pesquisaVeiculo(@PathVariable String placa){
        return ResponseEntity.ok(service.getVeiculo(placa));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VeiculoDto>> getAll(){
        List<VeiculoDto> veiculos = service.getAll();
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/allOrder")
    public ResponseEntity<List<VeiculoDto>> getAllOrder(){
        List<VeiculoDto> veiculos = service.getAllOrder();
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/all/{marca}")
    public ResponseEntity<List<VeiculoDto>> getAllMarca(@PathVariable String marca){
        List<VeiculoDto> veiculos = service.getAllMarca(marca);
        return ResponseEntity.ok(veiculos);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveVeiculo(@RequestBody Veiculo veiculo){
        service.saveVeiculo(veiculo);
    }


}
