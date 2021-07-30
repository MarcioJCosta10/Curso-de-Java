package br.com.mjcxdev.introducaojava;/*
    Switch é um comando semelhante ao If else
    Quando temos apenas uma comparação simples dentro do if e varias opções podemos utilizar o switch
    Temos uma regra: Os tipos das variáveis que podem ir dentro da condição do swicth são:
    char, int, byte, short, enum e String
    O switch é executado debaixo para cima
 */

public class Aula_13_ControFluxoSwitch {
    public static void main(String[] args) {

        /*byte dia = 3;
        if (dia == 1){
            System.out.println("Domingo");
        }else if (dia == 2){
            System.out.println("Segunda");
        }else if (dia == 3) {
            System.out.println("Terça");
        }else if (dia == 4) {
            System.out.println("Quarta");
        }else if (dia == 5) {
            System.out.println("Quinta");
        }else if (dia == 6) {
            System.out.println("Sexta");
        }else{
            System.out.println("Sábado");
        }*/

        //EXERCÍCIO
        /*
         * Crie um swicht que dado um valor de 1 A 7
         * Considerando 1 Domingo imprima se é dia util ou final de semana
         *
         * */

        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("É final de semana vamos curtir");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil vamos trabalhar");
                break;
            default:
                System.out.println("Digite um numero do dia da semana válido");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Informe o sexo da pessoa");
        }

    }
}
