package com.dh.meli.exerciciospring.dto;


import com.dh.meli.exerciciospring.model.Veiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VeiculoDto {
    private String modelo, marca;
    private double preco;

    public VeiculoDto(Veiculo veiculo){
        this.modelo = veiculo.getModelo();
        this.marca = veiculo.getMarca();
        this.preco = veiculo.getPreco();
    }
}
