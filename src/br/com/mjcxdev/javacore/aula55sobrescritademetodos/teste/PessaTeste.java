package br.com.mjcxdev.javacore.aula55sobrescritademetodos.teste;

import br.com.mjcxdev.javacore.aula55sobrescritademetodos.classes.Pessoa;

public class PessaTeste {
    public static void main(String[] args) {

       //3 Criando um objeto p da classe Pessoa e setando so atributos
        Pessoa p = new Pessoa();
        p.setNome("Joaquina");
        p.setIdade("300");

        //5Toda vez que tentarmos imprimir uma variável de referência dentro de uma classe ela vai imprimir o endereço de memória
        //Isso é porque é chamado o método toString() da classe Object
        //7 - agora ao imprimir o p o toString que será chamado será o que sobrescreveu o metodo
        System.out.println(p);

        //8 Agora toda vez que chamarmos o metodo toString ele terá o mesmo comportamento que foi determinado na sobrescrita para a classe
        Pessoa p2 = new Pessoa();
        p2.setNome("Ana Carolina");
        p2.setIdade("450");
        System.out.println(p2);
    }
}
