package com.company.models;

import com.company.interfaces.Carnivoros;

public class Gato extends Animal implements Carnivoros
{
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String emitirSom() {
        return "miau";
    }

    @Override
    public void comerCarne() {
        System.out.println("adoro um whiskas sabor carne!");
    }
}
