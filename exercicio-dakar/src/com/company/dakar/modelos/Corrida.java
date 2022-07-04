package com.company.dakar.modelos;

import java.util.ArrayList;

public class Corrida {
    private double distancia, premioEmDolares;
    private int quantidadeVeiculosPermitidos;
    private String nome;
    private ArrayList<Veiculo> listaVeiculo;

    public void addCarro(Carro carro){
        if(!listaVeiculo.contains(carro)) {
            if (this.quantidadeVeiculosPermitidos < listaVeiculo.size()) {
                this.listaVeiculo.add(carro);
                System.out.println(carro.getPlaca()+" adicionado com sucesso!");
            } else {
                System.out.println("Não há mais espaço para cadastrar um novo veículo");
            }
        }else{
            System.out.println(carro.getPlaca() + " já está nessa corrida!");
        }
    }

    public void addMoto(Moto moto){
        if(!listaVeiculo.contains(moto)) {
            if (this.quantidadeVeiculosPermitidos < listaVeiculo.size()) {
                this.listaVeiculo.add(moto);
                System.out.println(moto.getPlaca() + "adicionado com sucesso!");
            } else {
                System.out.println("Não há mais espaço para cadastrar um novo veículo");
            }
        } else {
            System.out.println(moto.getPlaca() + "já está nessa corrida!");
        }
    }

    public void deleteVeiculo(Veiculo veiculo){
        if(listaVeiculo.contains(veiculo)){
            listaVeiculo.remove(veiculo);
            System.out.println(veiculo.getPlaca() + " removido da corrida!");
        }else{
            System.out.println(veiculo.getPlaca() + " não está inscrito nessa corrida!");
        }
    }

    public void deleteVeiculoComPlaca(String placa){
        for (Veiculo veiculo: listaVeiculo){
            if(veiculo.getPlaca().equals(placa)){
                listaVeiculo.remove(veiculo);
                System.out.println(veiculo.getPlaca() + " removido com sucesso!");
            }
        }
    }


    public void calculaVencedor(){}
}
