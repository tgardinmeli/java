package com.company;

public class CircuitoAvancado extends Circuitos{


    @Override
    public String inscricaoCircuito(Participante participante) {
        if(participante.getIdade() < 18){
            return "Você é menor de idade, não pode se inscrever nesse circuito!";
        }
        return super.inscricaoCircuito(participante);
    }

    @Override
    public double calculaValor(Participante participante) {
        if(participante.getIdade() < 18){
            System.out.println("Você é menor de idade!");
            return 0;
        }
        return 1500.0;
    }

    @Override
    public String toString() {
        return "Grande";
    }
}
