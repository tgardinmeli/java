package com.dh.meli.exerciciospring.service;

import com.dh.meli.exerciciospring.dto.VeiculoDto;
import com.dh.meli.exerciciospring.model.Veiculo;
import com.dh.meli.exerciciospring.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class VeiculoServiceImp implements VeiculoService{
    @Autowired
    VeiculoRepo repo;

    @Override
    public VeiculoDto getVeiculo(String placa) {
        return new VeiculoDto(repo.getVeiculo(placa));
    }


    @Override
    public List<VeiculoDto> getAll() {
        List<Veiculo> listaVeiculos= repo.getAll();
        List<VeiculoDto> listaVeiculoDto = listaVeiculos.stream()
                .map(VeiculoDto::new)
                .collect(Collectors.toList());
        return listaVeiculoDto;
    }

    @Override
    public void saveVeiculo(Veiculo veiculo) {
            repo.saveVeiculo(veiculo);
    }

    @Override
    public List<VeiculoDto> getAllOrder() {
        List<VeiculoDto> lista = this.getAll();
        List<VeiculoDto> listaOrdenada = lista.stream().sorted( (v1, v2) -> v1.getModelo().compareTo(v2.getModelo()) ).collect(Collectors.toList());
        return listaOrdenada;
    }

    @Override
    public List<VeiculoDto> getAllMarca(String marca) {
        List<VeiculoDto> lista = this.getAllOrder();
        List<VeiculoDto> listaFiltrada = lista.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());
        return listaFiltrada;
    }


}
