package com.company.models;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: "+ this.nome + " Preço: "+ this.preco;
    }

    public double calcula(int quantidadeDeProdutos){
        return this.preco*quantidadeDeProdutos;
    }

}
