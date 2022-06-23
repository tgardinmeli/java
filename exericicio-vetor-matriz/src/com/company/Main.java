package com.company;

public class Main {
    public static void main(String[] args) {
        String cidades[] = new String[10];
        int temperaturas[][] = new int[10][2];

        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nova York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Assunção";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";


        temperaturas[0][0] = -2;
        temperaturas[0][1] = 33;

        temperaturas[1][0] = -3;
        temperaturas[1][1] = 32;

        temperaturas[2][0] = -8;
        temperaturas[2][1] = 27;

        temperaturas[3][0] = 4;
        temperaturas[3][1] = 37;

        temperaturas[4][0] = 6;
        temperaturas[4][1] = 42;

        temperaturas[5][0] = 5;
        temperaturas[5][1] = 43;

        temperaturas[6][0] = 0;
        temperaturas[6][1] = 39;

        temperaturas[7][0] = -7;
        temperaturas[7][1] = 26;

        temperaturas[8][0] = -1;
        temperaturas[8][1] = 31;

        temperaturas[9][0] = -10;
        temperaturas[9][1] = 35;


        int menorTemperatura = 0, maiorTemperatura = 0;

        int indiceMenor = 0, indiceMaior = 0 ;
        for (int i = 0; i < cidades.length ; i++){

            for (int j = 0; j< temperaturas[0].length; j+=2){

                if(menorTemperatura > temperaturas[i][0]){
                    menorTemperatura = temperaturas[i][0];
                    indiceMenor = i;

                }
                if(maiorTemperatura < temperaturas[i][1]){
                    maiorTemperatura = temperaturas[i][1];
                    indiceMaior = i;
                }

                System.out.println("\nCidade: "+cidades[i] + " Temperatura mínima: " + temperaturas[i][j] + " Temperatura máxima: " + temperaturas[i][j+1]);

            }
        }
        System.out.println("------------------------------------------------------------------------ \n ");
        System.out.println("Cidade com menor temperatura: "+cidades[indiceMenor] + " Temperatura: " +menorTemperatura);
        System.out.println("Cidade com maior temperatura: "+cidades[indiceMaior] + " Temperatura: " + maiorTemperatura);
    }

}