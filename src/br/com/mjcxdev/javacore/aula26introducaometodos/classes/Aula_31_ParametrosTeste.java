/*
*  Continuando aula de parâmetros
*  Lembre-se quando trabalhamos com vairiáveis de tipos primitivos, e passarmos
*  um valor do tipo primitivo através de uma variável para o método o valor da variável nunca será alterado
* */

package br.com.mjcxdev.javacore.aula26introducaometodos.classes;

public class Aula_31_ParametrosTeste {
    public static void main(String[] args) {
        // Variável de referência    // novo Objeto
        Aula_26_Calculadora calc = new Aula_26_Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNUmeros(num1,num2); // Aqui dentro dentro dos parâmetros será passado uma cópia da variável do tipo primitvo
                                           // Por mais que estejamos utilizando num1 e num2 o que será passado é a cópia de num1 e num2
        System.out.println("Dentro do teste");
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
    }

}
