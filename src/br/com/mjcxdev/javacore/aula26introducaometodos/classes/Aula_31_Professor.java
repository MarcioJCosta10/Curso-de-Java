package br.com.mjcxdev.javacore.aula26introducaometodos.classes;

/*
*   Métodos com parâmetros do tipo reference
*
* */
public class Aula_31_Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;
                       // Aqui criei a variavel de referência do tipo professor
    public void imprime(Aula_31_Professor aux){ // Vou passar o objeto que quero imprimir como parametros
        System.out.println("--------------------");
        System.out.println(aux.nome);
        System.out.println(aux.matricula);
        System.out.println(aux.rg);
        System.out.println(aux.cpf);
        aux.nome = "Mariana";               // Qualquer alteração no método irá impactar o objeto que está recebendo seu endereço de memória
        System.out.println(aux.nome);
    }
}
