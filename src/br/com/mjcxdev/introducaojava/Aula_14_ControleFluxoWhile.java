package br.com.mjcxdev.introducaojava;/*
    Estruturas de repetição

    O While é um repetidor que irá executar determinada condição até encontrar um false
    Dentro da condição do while devemos ter um boolean ou uma váriavel que receba boolean ou uma comparação
    // Se a condição for falsa nunca será impressa

    O Do{}While{} irá executar pelo menos uma vez independente do valor da condição

    O for não irá avaliar apenas uma instrução

    Iremos ver o for each quando trabalarmos com objetos
 */

public class Aula_14_ControleFluxoWhile {
    public static void main(String[] args) {
       // O while e do while vamos usar quando não sabemos quantas vezes teremos que repetir um pedaço de código
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;

        }
        do {
            System.out.println("Executou pelo menos uma vez");
        } while (contador > 10);
        // O for utilizamos quando temos um tamanho pré definido
        for (int i = 0; i < 10; i++) {
            System.out.println("Imprimindo dentro do for " + i);
            if (i == 5){
                break;
            }
        }
    }

}
