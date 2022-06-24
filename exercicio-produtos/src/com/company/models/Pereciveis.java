package com.company.models;

public class Pereciveis extends Produtos{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString() + " Dias para vencer: " + diasParaVencer ;
    }

    @Override
    public double calcula(int quantidadeDeProdutos) {
        if(this.diasParaVencer == 1){
            return super.calcula(quantidadeDeProdutos)/4;
        }
        if (this.diasParaVencer == 2){
            return super.calcula(quantidadeDeProdutos)/3;
        }
        if(this.diasParaVencer == 3){
            return super.calcula(quantidadeDeProdutos)/2;
        }
        return super.calcula(quantidadeDeProdutos);
    }
}
