package br.com.mjcxdev.javacore.aula26introducaometodos.teste;

/*
*    Na aula 25 criamos a classe Professor mas repetimos código para criar dois objetos
*    Na aula 31 vamos entender um dos princípios da orientação a objeto que é não repetir códigos
*
* */


import br.com.mjcxdev.javacore.aula26introducaometodos.classes.Aula_31_Professor;

public class Aula_31_ProfessorTeste {
    public static void main(String[] args) {
        Aula_31_Professor prof = new Aula_31_Professor();
        prof.cpf = "122.222.222-20";
        prof.matricula = "111222";
        prof.rg = "1224555-5";
        prof.nome = "Marcos";

        System.out.println(prof.cpf);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);

        // Ai temos o problema se quiser outro objeto teremos que repetir o código com a unica diferenca que é a variável de referencia

        Aula_31_Professor prof2 = new Aula_31_Professor();
        prof2.cpf = "555.555.562-20";
        prof2.matricula = "444444";
        prof2.rg = "565658-6";
        prof2.nome="Joana";

        System.out.println(prof2.cpf);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);

        // Como evitar a repetição? Vamos na classe professor e criar o método imprime
        // Como já tenho dentro do método o que quero imprimir basta chamar aqui
        System.out.println("Dentro do professor teste");
        System.out.println(prof.nome);
        prof.imprime(prof); // Aqui estou passando o endereço do objeto estou dizendo para
        System.out.println(prof.nome);
                            // a variável do método fazer referência ao objeto prof
//        prof.imprime(prof2); // E não preciso mais das linhas repetidas para imprimir

        // Quando usamos variáveis do tipo primitivo estamos passando uma cópia dos valoes
        // Mas quando usamos variáveis do tipo reference temos que ter cuidado
        // Pois estamos passando o endereço de memória que esse objeto se encontra




    }
}
