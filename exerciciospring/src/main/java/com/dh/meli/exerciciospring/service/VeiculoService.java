package com.dh.meli.exerciciospring.service;

import com.dh.meli.exerciciospring.dto.VeiculoDto;
import com.dh.meli.exerciciospring.model.Veiculo;

import java.util.List;

public interface VeiculoService {
    VeiculoDto getVeiculo(String placa);
    List<VeiculoDto> getAll();
    void saveVeiculo(Veiculo veiculo);
    List<VeiculoDto> getAllOrder();
    List<VeiculoDto> getAllMarca(String marca);

}
