/*
*   Novo tipo de passagem de parametros varargs
*
    Então essa é uma forma de trabalhar com passagem de multiplos parâmetros
    Agora imagine que não sabemos quantos numeros vamos ter.
    Para facilitar nossa vida temos o varargs
    É como se fosse um parâmetro de array que vai receber diversos tipos de valor

    A diferença entre criar parametros do tipo array e do tipo varargs é que com o
    varargs podemos passar tanto um objeto array como os valores separados com vírgula;
    REGRAS:
    * Só podemos ter um varargs por assinatura
    * Caso queira mais parametros o varargs precisa ser o ultimo parametro
*
* */

package br.com.mjcxdev.javacore.aula26introducaometodos.classes;

public class Aula_33_Calculadora {

    public void somaArray(int[] numeros){ // Aqui esse método recebe com parâmetro um array de int
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);

    }
                //Sintaxe
                        //tipo ... nomeVariavel
    public void somaVarArgs(int...numeros){ // Quando o java receber os valore ele se encarrega de criar um array assim podemos trabalhar com esse array
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);

    }

}
