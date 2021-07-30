package br.com.mjcxdev.introducaojava;/*
    EXERCÍCIO CONTROLE DE FLUXO
    Imprima todos os números pares de 0 a 100.000
 */

public class Aula_16_ControleFluxoForWhileDoWhile {
    public static void main(String[] args) {
        int valor = 100;
        int i = 0;
        for (i = 0; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println(" O número " + i + " é par");
            } else {
                System.out.println(" O número " + i + " é impar");
            }
        }


    }
}
