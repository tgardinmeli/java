package com.company;

public class CircuitoPequeno extends Circuitos {


    @Override
    public double calculaValor(Participante participante) {
        if(participante.getIdade() < 18){
            return 1300.0;
        }
        return 1500.0;
    }

    @Override
    public String toString() {
        return "Pequeno";
    }
}
