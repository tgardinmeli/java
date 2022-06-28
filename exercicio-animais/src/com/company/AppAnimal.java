package com.company;

import com.company.models.Animal;
import com.company.models.Cachorro;
import com.company.models.Gato;
import com.company.models.Vaca;

public class AppAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo", "SRD");
        Gato gato = new Gato("Garfield", "Persa" );
        Vaca vaca = new Vaca("Mimosa", "Angus");

        System.out.println(gato.emitirSom());
        System.out.println(cachorro.emitirSom());
        System.out.println(vaca.emitirSom());

        cachorro.comerCarne();
        gato.comerCarne();
        vaca.comerPasto();

    }
}
