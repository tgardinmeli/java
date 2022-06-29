package com.company;

public class Participante {
    private String nome, sobrenome, rg, tipoSanguineo;
    private int idade, numeroTelefone, numeroEmergencia, id;
    private Circuitos circuito;


    public Participante(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade=idade;
    }

    public boolean podeInscrever(){
        if(this.circuito == null){
            return true;
        }
        return false;
    }

    public int getIdade() {
        return idade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCircuito(Circuitos circuito) {
        this.circuito = circuito;
    }

    public Circuitos getCircuito() {
        return circuito;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Participante: " + this.nome + this.sobrenome + " Circuito: "+this.circuito;
    }
}
