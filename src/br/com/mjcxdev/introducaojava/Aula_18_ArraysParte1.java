package br.com.mjcxdev.introducaojava;/*
 * Criando nosso primeiro array
 *   Qualquer array em Java é considerado um Objeto, dentro do array podemos colocar tipos primitivos
 *   mas a referência do array será sempre um objeto
 * */

public class Aula_18_ArraysParte1 {
    public static void main(String[] args) {
        // Aqui é a sintaxe para criar o array // ou int idade2 [];
        // int[] idade; Até esse ponto temos apenas a variável de referência
        // Para criar o array na memória temos algumas formas
        int[] idade = new int[5]; // 1ª Regra - ao criar um array em java precisamos passar o tamanho
        // 2ª Regra - só poderemos usar a palavra new com tipos primitivos para criar arrays
        // pois new é usado para criar objetos, por isso array é sempre um objeto


        // Como preencher um array
        // Como criei um array de int dentro do array só posso colocar valores interiros
        idade[0] = 1;
        idade[1] = 10;
        idade[2] = 20;
        idade[3] = 30;
        idade[4] = 40;

        // Como acessar os valores do array
        for (int i = 0; i <= idade.length - 1; i++) {
            System.out.println("Idade na posição:  " + i +" é igual a "+ idade[i]);
        }
        // Lembre-se array é sempre um objeto
        // A variável idadade é do tipo references, é um obejto que vai fazer referencia a um array de 5 posições na memória

    }
}
