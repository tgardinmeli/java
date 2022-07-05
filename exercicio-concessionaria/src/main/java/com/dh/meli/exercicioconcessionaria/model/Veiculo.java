package com.dh.meli.exercicioconcessionaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private String marca, modelo, placa;
    private int anoFabricacao , kmRodado, quantidadePortas, quantidadeProprietarios;
    private double preco;
    private List<Servico> servicoList;
}
