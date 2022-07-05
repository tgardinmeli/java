package com.dh.meli.exercicioconcessionaria.repository;

import com.dh.meli.exercicioconcessionaria.model.Veiculo;
import org.springframework.stereotype.Repository;



@Repository
public class VeiculoRepo {
    private final String endpoint = "";

    public Veiculo getVeiculo(String placa){
        return new Veiculo ();
    }

}
