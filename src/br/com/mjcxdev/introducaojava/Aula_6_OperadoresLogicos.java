package br.com.mjcxdev.introducaojava;    /*
        Operadores Lógicos
        && and só será verdadeiro se ambas forem verdadeiras
        || or só será verdadeiro se uma delas for verdadeira
     */

public class Aula_6_OperadoresLogicos {

    public static void main(String[] args) {
        int idade = 18;
        float salario = 1000f;

        System.out.println( idade >= 18 && salario >= 1000 );// Sempre será avaliado a expressão inteira para determinar se é verdadeiro ou falso de acordo com a tabela verdade do and e do or
        System.out.println( idade >= 18 && salario >= 1000 );
        System.out.println( idade >= 18 );
    }


}
