/*
*   0 - Bloco de inicialização estático é executado quando a JVM carregar a classe( é executado apenas 1 vez)
*   1 - Alocado espaço na memória para o obejto que será criado
*   2 - Cada atributo da classe é criado e inicializado com seus valores defaultou valores explicitos
*   3 - Bloco de inicialização é executado
*   4 - O contrutor é executado
*
*
* */


package br.com.mjcxdev.javacore.aula44blocosdeinicializacaoestatico.classes;

// 1 - Aqui criamos o atributo parcelar e estamos imaginando que terá um dropbox que receberá parcelas até 100
public class Cliente {
        //6 - aprendemos que para criar um método estático devemos mudar ele para static
        private static int[] parcelas;
        // 11 - Então par termos um bloco de inicialização estático, usamos a palavra static antes do bloco de inicialização
        // Temos que ter cuidado pois o bloco de inicialização estático é inializado apenas uma vez
        {
            System.out.println("Bloco de inicialização não estático");
        }

        //AQUI CRIAMOS O BLOCO DE INICIALIZAÇÃO ESTÁTICO
        static {
            parcelas = new int[80];// 2 - Inicializamos o array e colocamo um for de 1 a 100, está funcionando porém não é o melhor código
            System.out.println("Dentro do bloco de inicialização estático");
            for (int i = 1; i <= 80; i++) {
                parcelas[i - 1] = i;
            }
        }
    // 13 - E se tivermos mais de um bloco estático de inicialização, serão executados na ordem que eles aparecerem?
        static {
            System.out.println("Bloco estático 2");
        }
        static {
            System.out.println("Bloco estático 3");
        }
        public Cliente() {
        }
        // 7 - E também devemos mudar os get e set para static
        public static int[] getParcelas() {

            return parcelas;
        }
        // 9 - Na verdade o set Não precisamos pois estamos fazendo através do bloco de inicialização
        // public static void setParcelas(int[] parcelas) {
        // 8 - e não usamos mais o this
        //   Cliente.parcelas = parcelas;
        //}
}
