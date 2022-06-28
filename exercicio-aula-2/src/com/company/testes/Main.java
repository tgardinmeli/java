package com.company.testes;

import com.company.models.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Pessoa2",24, "123");
        Pessoa pessoa3 = new Pessoa("Pessoa3", 30, "12345",70,1.63);

        System.out.println(pessoa3.toString());



    }
}
