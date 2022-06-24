package com.company.models;

import java.time.LocalDateTime;

public class Pessoa {
    private String nome;
    private int idade;
    private String id;
    private double peso, altura;
    //teste com LocalDateTime
    private LocalDateTime data = LocalDateTime.now();

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calculaIMC(){
        double resultado = this.peso/(this.altura*2);
        if(resultado <20){
            return -1;
        }
        if(resultado >= 20 || resultado <= 25){
            return 0;
        }
        return 1;
    }

    public boolean ehMaiorDeIdade(){
        if(this.idade <18){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public LocalDateTime getData() {


        return data;
    }
}
