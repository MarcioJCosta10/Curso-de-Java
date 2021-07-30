/*
 *   Vamos começar a falar do comportamento das classes
 *   métodos é uma forma de encapsular o código, criar código reusável
 *   Convenção para criação de método é o mesmo das variáveis 1ª letra minúscula e se tiver duas palavras será com
 *   o inicio em maiúscula testeMetodo
 *
 * */

package br.com.mjcxdev.javacore.aula26introducaometodos.classes;

import sun.security.mscapi.CPublicKey;

//Essa classe não é para teste e não terá o main
public class Aula_26_Calculadora {
    //tipo de acesso  // tipo de retorno  // nome do método
    public static void somaDoisNumeros() {

        System.out.println(5 + 5);
    }

    public static void subtraiDoisNumeros() {

        System.out.println(5 - 5);
    }

    // Como passar parâmetros para os métodos
    // parametros 1 e 2
    public static void multiplicaDoisNumeros(double num1, byte num2, double num3) { // Criamos duas variaveis locais que são os parâmetros
        System.out.println(num1 * num2 * num3);                              // Podemos passar quantos parametros desejarmos
    }                                                                        // Podemos passar tipos de parametros diferentes


    // Métodos com retorno
    public static double divideDoisNumeros(double num1, double num2) {
        // 1ª para criar um return é criando uma variável auxiliar
        //double resultado = num1/num2;
        //return resultado;

        // 2ª Forma é retornar direto no return
        return num1 / num2;

        // Temos que ficar atento aos tipos do método dos parametros e do retorno
        // O tipo do método e o tipo de return precisam ser o mesmo
        // Ou se precisarmos podemos fazer um cast
    }

    public static int divideDoisDoubleRetonaInt(double num1, double num2) {
        //fazendo o cast
        return (int) (num1 / num2);
    }

    // Se eu passar como argumento dividido por Zero?
    // Teremos o resultado Infinity
    public static double divididoPorZero(double num1, double num2) {
        // Vamos nos preparar para esse erro
        if (num2 != 0) {
            return num1 / num2; // Sempre que colocarmos um return dentro de um if teremos que ter outro return dntro do else
        } else {
            return 0;               // Não podemos deixar o return sem valor, somente quando for um método void
        }
        //System.out.println();     // Outra coisa que devemos ficar atento e que quando o código
        //  encontrar um return ele não irá para a classe que o chamou
        // São os códigos inatingíveis Unreachable statement


    }

    public static void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            // Quando estamos trabalhamos com métodos com return void podemos usar o return como se fosse um break;
            return;
            // Dessa forma não precisaremos mais do else
            //} else {
        }
           System.out.println("Não é possível dividir por zero");
        }

        //
        public static void alteraDoisNUmeros(int num1, int num2){ // Quando passamos argumentos do tipo primitivo para o método
                                                           // estamos passando uma cópia desses valores
                                                           // Os valores originais nunca serão alterados
        num1 = 30;
        num2 = 40;
            System.out.println("Dentro do método");// Aqui dentro do método num1 e num2 vale 0 e 40
            System.out.println("num1:"+ num1);
            System.out.println("num2:"+ num2);

        }
    }
