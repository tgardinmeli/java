package com.company;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;
        int resultado = 0;

        try{
            resultado = b/a;
        }catch (Exception ex){
            throw new IllegalArgumentException("“Não pode ser dividido por zero”.");
        }finally {
            System.out.println("Fim do programa!");
        }
    }
}
