package com.company;

public class Veiculo {
    private String modelo, marca;
    private double preco;

    public Veiculo(String marca, String modelo, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return "Veiculo{" + this.modelo + ", "+ this.marca +", " +this.preco +"}";
    }
}
