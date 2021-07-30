/*
*
*
* */

package br.com.mjcxdev.javacore.aula44blocosdeinicializacaoestatico.teste;

import br.com.mjcxdev.javacore.aula44blocosdeinicializacaoestatico.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        // 4 - Vamos criar os objetos cliente1 e cliente2

        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        // 5 - Ao imprimir veremos que o bloco de inicialização independente da quantidade de objetos tiver ele será inicializado
        // porém para todos os objetos cliente nesse caso as quantidades de parcelas será sempre 100
        // Vimos nas aulas passadas que temos os atributos estáticos e os métodos estáticos que são compartilhado

        System.out.println("Exibindo número de parcelas possíveis");


        //for(int parcela : Cliente.getParcelas()){
        //12 Ao imprimir veremos que chamaos a classe cliente 3 vezes mas ela só imprimiu uma vez o bloco de inicialização, seja no momento da criação de um obejto
        // Seja usando um método estático, só será inicializado uma vez
            System.out.print("Tamanho: " + Cliente.getParcelas().length );


        //}


}
}
