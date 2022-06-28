package com.company.models;

import com.company.interfaces.Carnivoros;

public class Cachorro extends Animal implements Carnivoros {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String emitirSom() {
        return "auau";
    }

    @Override
    public void comerCarne() {
        System.out.println("adoro uma ração sabor frango!");
    }
}
