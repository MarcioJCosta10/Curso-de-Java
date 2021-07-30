package br.com.mjcxdev.introducaojava;/*
 * O comando continue vai sair do código e vai voltar para para o começo do iteração
 * O continue faz todos os comando abiaxo dele ser ignorado
 * Nesse exemplo enquanto a parcela for menor que 1000 não execute o código abaixo e volte para o loop
 * */


public class Aula_17_ComandoContinue {

    public static void main(String[] args) {

        // Dado um valor de uma carro descubra em quantas vezes ele pode ser parcelado
        //Porém as parcelas não pode ser menor do que 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue;
                 // se colocarmos qualquer código abaixo ao contínue dará erro de compilação pois nunca será atingido;
                // System.out.println();

            }
            // Com o contínue essa mensagem só será impressa se a  parcela for maior que 1000
            System.out.println("Parcel " + parcela + " R$ " + valorParcela);


        }


    }
}
