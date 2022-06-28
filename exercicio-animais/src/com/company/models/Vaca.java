package com.company.models;

import com.company.interfaces.Herbivoros;

public class Vaca extends Animal implements Herbivoros {
    public Vaca(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String emitirSom() {
        return "muuuuuu";
    }

    @Override
    public void comerPasto() {
        System.out.println("adoro uma graminha!");
    }
}
