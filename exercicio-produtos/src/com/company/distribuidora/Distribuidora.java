package com.company.distribuidora;

import com.company.models.NaoPereciveis;
import com.company.models.Pereciveis;
import com.company.models.Produtos;

public class Distribuidora {
    public static void main(String[] args) {
        Produtos[] produtos = {new Pereciveis("Leite", 4.49, 1), new NaoPereciveis("arroz", 10.5, "cereais"), new Pereciveis("Danone", 2.3, 2), new Pereciveis("manteiga", 9.99, 10), new Pereciveis("ovo", 14.5, 3)};


        for(Produtos produto: produtos){

            System.out.println();
            System.out.println(produto + " Valor Total: " + produto.calcula(5));
        }

    }
}

