package br.com.mjcxdev.introducaojava;/*
*   O comando break interrompe a execução e sai do código
*
* */

public class Aula_17_ComandoBreak {
    public static void main(String[] args) {
        // Dado um valor de uma carro descubra em quantas vezes ele pode ser parcelado
        //Porém as parcelas não pode ser menor do que 1000

        int valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            /*
            if (valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }else{
                System.out.println("saindo do laço");
                break;
            }
            System.out.println("Fora do laço");
            */

            // Podemos inverter a lógica e deixar  o carro mais limpo
            if (valorParcela < 1000) {
                break;
            } else {
                System.out.println("Parcel " + parcela + " R$ " + valorParcela);
            }
        }


    }
}
