package br.com.mjcxdev.javacore.aula24introducaopacotes.teste;

import br.com.mjcxdev.javacore.aula24introducaopacotes.classes.Aula_24_Estudante;

/*
*   Agora temos a classe estudante e estudanteteste
*   Qual a diferença de variáveis para objetos? Em obejtos conseguimos muito mais caracterísitcas, mais variáveis dentro de um mesmo espaço de memória
*
* */
public class Aula24EstudanteTeste { // Aqui temos o objeto que é uma instância da classe
    public static void main(String[] args) {
        // Como criar objetos?
                   // variavel de referência
        //tipo     //identificador   //new é para iniciar objetos  // tipo desse objeto
        Aula_24_Estudante joao           = new Aula_24_Estudante();
        // Como colocar valores no objeto ? será através da variável joão
        joao.nome = "João";     // Aqui temos os atributos de instancia
        joao.matricula = "1212";
        joao.idade = 15;

        // Como imprimir o objeto?
        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);


    }
}
