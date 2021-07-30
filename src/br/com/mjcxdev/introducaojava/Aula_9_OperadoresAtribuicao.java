package br.com.mjcxdev.introducaojava;/*
    Operadores de atribuição
    Feitos para poupar linhas de código

     =
    -=
    +=
    *=
    /=
    %=



 */

public class Aula_9_OperadoresAtribuicao {
    public static void main(String[] args) {
        int salario = 1000;
        //  salario = salario + 1000;
            salario += 1000;
        //  salario -= 100;
        //  salario *= 0.1;
            salario = salario + (int)(salario * 0.1);
        System.out.println( salario);
        int numero = 10;
            numero %=2;
        System.out.println(numero);
    }
}
