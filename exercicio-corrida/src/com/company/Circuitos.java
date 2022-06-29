package com.company;


import java.util.HashMap;

public abstract class Circuitos {

    private HashMap<Integer, Participante> circuito = new HashMap<Integer, Participante>();
    private static Integer contadorDeParticipantes = 1;

    public String inscricaoCircuito(Participante participante){
        if(participante.podeInscrever()){
            participante.setCircuito(this);
            participante.setId(contadorDeParticipantes);
            circuito.put(contadorDeParticipantes, participante);
            contadorDeParticipantes++;
            return "Inscrição realizada com sucesso!";

        }
        return "Você já está inscrito em um Circuito!";
    }

    public String removerInscricao(Participante participante){

        if(participante.getCircuito() !=  null) {
            participante.setCircuito(null);
            circuito.remove(participante.getId());
            return "Incrição excluida com sucesso!";
        }
        return "Você não está inscrito em nenhum circuito!";
    }

    public HashMap<Integer, Participante> getCircuito() {
        return circuito;
    }

    public abstract double calculaValor(Participante participante) ;

}
