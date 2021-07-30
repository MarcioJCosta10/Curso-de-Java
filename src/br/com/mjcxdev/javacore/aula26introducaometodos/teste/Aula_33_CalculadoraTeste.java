package br.com.mjcxdev.javacore.aula26introducaometodos.teste;

import br.com.mjcxdev.javacore.aula26introducaometodos.classes.Aula_33_Calculadora;

public class Aula_33_CalculadoraTeste {
    public static void main(String... args) {// O método pvsm recebe um array de string então podemos usas o varargs
        Aula_33_Calculadora calc = new Aula_33_Calculadora();
        int [] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);

        // Então essa é uma forma de trabalhar com passagem de multiplos parâmetros
        // Agora imagine que não sabemos quantos numeros vamos ter
        // Para facilitar nossa vida temos o varargs

        // Temos uma mudança na chamada do método
        calc.somaVarArgs(numeros); // Podemos continuar passando o array
        calc.somaVarArgs(5,6,8,9,10); // Mas podemos passar também os valores separados por virgula
        // Quando o java receber os valores ele se encarrega de criar um array assim podemos trabalhar com esse array
    }
}
