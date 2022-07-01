package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Garagem garagem = new Garagem();
	    Veiculo c1 = new Veiculo("Ford", "Fiesta", 1000);
	    Veiculo c2 = new Veiculo("Ford", "Focus", 1200);
	    Veiculo c3 = new Veiculo("Ford", "Explorer", 2500);
	    Veiculo c4 = new Veiculo("Fiat", "Uno", 500);
	    Veiculo c5 = new Veiculo("Fiat", "Cronos", 1000);
	    Veiculo c6 = new Veiculo("Fiat", "Torino", 1250);
	    Veiculo c7 = new Veiculo("Chevrolet", "Aveo", 1250);
	    Veiculo c8 = new Veiculo("Chevrolet", "Spin", 2500);
	    Veiculo c9 = new Veiculo("Toyota", "Corola", 1200);
	    Veiculo c10 = new Veiculo("Toyota", "Fortuner", 3000);
	    Veiculo c11 = new Veiculo("Renault", "Logan", 950);

		Stream stream = garagem.getListaGaragem().stream();
		Collections.addAll(garagem.getListaGaragem(),c1,c2,c3,c4, c5, c6, c7, c8, c9, c10, c11);

		System.out.println("\n------------------------Lista NÃO ordenada pelo preço------------------------");
		garagem.getListaGaragem().stream().forEach(System.out::println);


		System.out.println("\n------------------------Lista ordenada pelo preço------------------------ ");
		garagem.getListaGaragem().stream().sorted((a,b) -> Double.compare(a.getPreco(),b.getPreco())).forEach(System.out::println);



		System.out.println("\n------------------------Lista ordenada pela marca------------------------ ");
		garagem.getListaGaragem().stream().sorted((a,b) -> a.getMarca().compareTo(b.getMarca())).forEach(System.out::println);



		System.out.println("\n------------------------Lista dos carros com preço abaixo de  1000,00----------------------- ");
		garagem.getListaGaragem().stream().filter(v -> v.getPreco() < 1000).forEach(System.out::println);



		System.out.println("\n------------------------Lista dos carros com preço maior ou igual a 1000,00----------------------- ");
		garagem.getListaGaragem().stream().filter(v -> v.getPreco() >= 1000).forEach(System.out::println);



		System.out.println("\n------------------------Média preços dos carros----------------------- ");
		double media = garagem.getListaGaragem().stream().mapToDouble(n -> n.getPreco()).average().getAsDouble();
		System.out.println("Media preços dos carros: " + media);


    }
}
