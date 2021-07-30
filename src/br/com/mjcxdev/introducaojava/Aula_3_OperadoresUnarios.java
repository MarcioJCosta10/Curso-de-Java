package br.com.mjcxdev.introducaojava;

public class Aula_3_OperadoresUnarios {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int soma = num1 + num2;
        System.out.println(" A soma vale " + soma);
        System.out.println( num1 + num2 );
        System.out.println( "A soma é: "+ num1 + num2 ); // Se usarmos esse operador após uma string dentro do sout o Java vai concatenar tudo pois todos os outro operadores + será usado como concatenar;
        System.out.println( "A soma é: "+ (num1 + num2)); // Assim não concatenará;
        System.out.println( "A soma é: "+ (num1 * num2));
        System.out.println( "A soma é: "+ (num1 - num2));
        System.out.println( "A soma é: "+ (num1 / num2)); // Aqui como a variável é inteira o resultado será inteiro

    }
}

// Operadores Unários
   /*
            ++  Incremento
            --  Decremento
            +   Adição
            *   Multiplicação
            /   Divisão
            -   Subtração
            ()  Cast
            !   Not


    */
