/*
 * Blocos de inicialização não estáticos podem acessar atributos estáticos, pois esse atributo;
 *
 * Regras de inicialização de objeto no java:
 * 1 - Alocado espaço na memória para o objeto que será criado
 * 2 - Cada atributo de classe é criado é inicializado com seus valores default ou os valores explicitos
 * 3 - Bloco de inicialização é executado
 * 4 - O construtor é executado
 * */
//1- Imagine a seguinte situação, vamos fazer um dropdow list de parcelas

package br.com.mjcxdev.javacore.aula41blocosdeinicializacao.classes;

public class Cliente {
      private static int[] parcelas ; // 8 vamos remover a inicialização do array {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // 2- vamos criar um array para

    // 8 O bloco de inicialização segundo as boas práticas devem ficar antes do construtor, mas pode ser inicializado em qualquer lugar que estiver no cóidigo
    {
        parcelas = new int[80]; // 9 precisamos inicializar o array antes
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i <= 80; i++) {
            parcelas[i - 1] = i;
        }
        // 10 - toda vez que o objeto é criado ele receberá os 80 valores via bloco de inicialização
    }


    // 6 - Vamos criar um construtor vazio, para ver se os valores do array vão estar inicializado quando temos o construtor
    // 7 - Agora imagine que teremos que colocar as 80 parcelar, o construtor deve
    public Cliente() {
        System.out.println("Dentro do construtor");
        // 9 Podemo tirar esse código dentro do construtor
        // for(int parcela : this.parcelas) {
        //   System.out.print(parcelas + " " );
        // }
    }

    // 8 - O construtor devemos mater limpo então vamos usar o bloco de inicialização para inicializar as 80 parcelas

    // 7 - E também devemos mudar os get e set para static
    public static int[] getParcelas() {
        return parcelas;
    }
    // 10 - Na verdade o set Naão precisamos pois estamos fazendo através do bloco de inicialização
   // public static void setParcelas(int[] parcelas) {
        // 11 - e não usamos mais o this
     //   Cliente.parcelas = parcelas;
    //}
}
