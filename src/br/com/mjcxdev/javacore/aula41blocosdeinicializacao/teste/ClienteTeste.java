package br.com.mjcxdev.javacore.aula41blocosdeinicializacao.teste;

import br.com.mjcxdev.javacore.aula41blocosdeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        //3 - Criei o objeto cliente
        Cliente cliente = new Cliente();

        System.out.println("Exibindo número de parcelas possíveis");
        //4 Imprimindo as parcelas via foreach
        for(int parcela : cliente.getParcelas()){
            System.out.print(parcela + " " );

            // 5 Imagine que esse código vai ser exibido dentro do dropdown

            //10 shift + f10 - Ai veremos que mesmo antes de executar o construtor já temos os dados na memória
            // por causa da regra de inicialização do java

            // 11 Agora imagine que essa classe cliente será vendida para uma concecionária
            // E precisamos alterar essa classe para 80 vezes
            // ai para não termos que escrever 80 vezes podemos inicializar essas parcelas no construtor
            // mas não é uma boa ideia pois devemos mantes o construtor limpo, então
            // Vamos usar o bloco de inialização que vem antes do contrutor mas não podemos passar valores para
            // um bloco de inicialização


        }

    }
}
