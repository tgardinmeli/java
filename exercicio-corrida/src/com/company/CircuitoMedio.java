package com.company;

public class CircuitoMedio extends Circuitos{
    @Override
    public double calculaValor(Participante participante) {
        if(participante.getIdade() < 18){
            return 2000.0;
        }
        return 2300.0;
    }
    @Override
    public String toString() {
        return "Medio";
    }
}
