package com.company;

public class Main {

    public static void main(String[] args) {
		CircuitoPequeno cp = new CircuitoPequeno();
		CircuitoMedio cm = new CircuitoMedio();
		CircuitoAvancado ca = new CircuitoAvancado();

		Participante p1 = new Participante("Participante ", "1",18);
		Participante p2 = new Participante("Participante ", "2",12);
		Participante p3 = new Participante("Participante ", "3",20);
		Participante p4 = new Participante("Participante ", "4",25);
		Participante p5 = new Participante("Participante ", "5",45);
		Participante p6 = new Participante("Participante ", "6",10);

		System.out.println(cp.inscricaoCircuito(p1));
		System.out.println(cp.inscricaoCircuito(p2));
		System.out.println(cm.inscricaoCircuito(p3));
		System.out.println(cm.inscricaoCircuito(p4));
		System.out.println(ca.inscricaoCircuito(p5));
		System.out.println(ca.inscricaoCircuito(p6)); // não consegue fazer incrição, é menor de 18


		System.out.println("\n--------------------------------");
		System.out.println(cp.inscricaoCircuito(p6));///faz inscrição em outro cicuito
		System.out.println(cm.inscricaoCircuito(p4));//já está incrito em outro circuito

		System.out.println(ca.inscricaoCircuito(p5));

		System.out.println("\n--------------------------------");
		System.out.println(cp.removerInscricao(p2)); // remover inscrição
		System.out.println(cm.inscricaoCircuito(p2)); // inscrever em outro circuito

		System.out.println("\n--------------------------------");
		System.out.println(ca.calculaValor(p6));
		System.out.println(cm.calculaValor(p5));
		System.out.println(cp.calculaValor(p1));

		System.out.println("\n----------------Todos os participantes do Circuito Pequeno----------------");

		cp.getCircuito().forEach((key,value) -> {
			System.out.println(value);
		});

		System.out.println("\n----------------Todos os participantes do Circuito Medio----------------");

		cm.getCircuito().forEach((key,value) -> {
			System.out.println(value);
		});

		System.out.println("\n----------------Todos os participantes do Circuito Grande----------------");

		ca.getCircuito().forEach((key,value) -> {
			System.out.println(value);
		});













    }
}
