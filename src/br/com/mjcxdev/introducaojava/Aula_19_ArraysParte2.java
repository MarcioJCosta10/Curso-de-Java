package br.com.mjcxdev.introducaojava;/* 1ª Regra - Todas as vezes que formos iniciarmos um array deveremos informar o tamanho desse array
   2ª Regra - Uma vez criado o array esse tamanho é fixo, ele não é expansível
*
* */

public class Aula_19_ArraysParte2 {
    public static void main(String[] args) {
        //Criei um array de tres int
        int[] idade = new int[3];
        System.out.println("Idade 1 " + idade[0]);
        System.out.println("Idade 2 " + idade[1]);
        System.out.println("Idade 3 " + idade[2]);

        // Os espaços na memória do array é inicializado com o valor padrão:
        // Para int, byte, short, long, floar, double o valor padão é sempre zero
        // Para char será um unicode vazio \u0000''
        // Para boolean será false
        // Para array de objetos, do tipo references será null

        String[] nome = new String [4];
        nome[0]="Goku";
        nome[1]="Naruto";
        nome[2]="Luffy";
        nome[3]="Kurosaki";

        for (int i=0; i <= nome.length; i++){
            System.out.println((i+1) + " nome"+nome[i]);
        }

    }
}
