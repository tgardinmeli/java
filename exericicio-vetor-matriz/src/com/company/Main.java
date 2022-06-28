package com.company;

public class Main {
    public static void main(String[] args) {
        String cidades[] = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunção", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperaturas[][] ={{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1,31}, {-10,35}} ;

        
        int menorTemperatura = Integer.MAX_VALUE;
        int maiorTemperatura = Integer.MIN_VALUE;


        int indiceMenor = 0, indiceMaior = 0 ;
        for (int i = 0; i < cidades.length ; i++){
            if(menorTemperatura > temperaturas[i][0]){
                menorTemperatura = temperaturas[i][0];
                indiceMenor = i;

            }
            if(maiorTemperatura < temperaturas[i][1]){
                maiorTemperatura = temperaturas[i][1];
                indiceMaior = i;
            }
        }
        System.out.println("------------------------------------------------------------------------ \n ");
        System.out.println("Cidade com menor temperatura: "+cidades[indiceMenor] + " Temperatura: " +menorTemperatura);
        System.out.println("Cidade com maior temperatura: "+cidades[indiceMaior] + " Temperatura: " + maiorTemperatura);
    }

}

//Cidade com menor temperatura: Tokio Temperatura: -10
//Cidade com maior temperatura: São Paulo Temperatura: 43