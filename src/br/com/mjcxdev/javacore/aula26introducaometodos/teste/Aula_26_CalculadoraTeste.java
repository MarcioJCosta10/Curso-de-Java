package br.com.mjcxdev.javacore.aula26introducaometodos.teste;

import br.com.mjcxdev.javacore.aula26introducaometodos.classes.Aula_26_Calculadora;

public class Aula_26_CalculadoraTeste {
    public static void main(String[] args) {
        // Vamos criar o objeto
        // variável de referência    // novo objeto
        Aula_26_Calculadora calc  =  new Aula_26_Calculadora();

        // Vamos chamar o método
        System.out.println("Soma de dois números");
        calc.somaDoisNumeros();

        System.out.println("Subtração de dois números");
        calc.subtraiDoisNumeros();

        // Chamando a função que recebe os argumentos dos parâmetros
        System.out.println("Multiplicação de três números");
                                  // argumentos
        calc.multiplicaDoisNumeros(10,(byte)6,6); // Os argumentos precisam ser do mesmo tipo do método
                                                  // Podemos fazer o cast dentro dos parametros mas
                                                  // não é uma boa ideia

        // Chamando o método com retorno
        // Como ele retorna um valor, esse valor provavelmente será usado na classe que o chamou
        // Devemos atribuir esse retorno a uma variável
        System.out.println("Divisão de dois números");
        double result = (calc.divideDoisNumeros(8,2));
        System.out.println(result);
        //ou imprimir diretamente
        System.out.println("Divisão de dois números");
        System.out.println((calc.divideDoisNumeros(8,2)));

        System.out.println("Divisão de dois numeros com cast");
        int result2 = calc.divideDoisDoubleRetonaInt(10,2);
        System.out.println(result2);

        System.out.println("Divisão por Zero");
        double result3 = calc.divididoPorZero(5,0);
        System.out.println(result3);

        System.out.println("Return com void");
        calc.imprimeDoisNumerosDivididos(20,0);

        // System.out.println(calc.imprimeDoisNumerosDivididos(5,0)); -- Não podemos colocar dentro de um sout um método que retorna void
        System.out.println("Continuando a execução...");
    }



}
