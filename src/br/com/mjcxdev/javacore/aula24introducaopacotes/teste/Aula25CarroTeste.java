package br.com.mjcxdev.javacore.aula24introducaopacotes.teste;

import br.com.mjcxdev.javacore.aula24introducaopacotes.classes.Aula_25_Carro;
// O import abrevia o caminho da classe

public class Aula25CarroTeste {
    public static void main(String[] args) {
        Aula_25_Carro carro = new Aula_25_Carro(); // Temos o objeto
        // System.out.println(carro.placa);         // Aqui pegamos os atributos da classe

        carro.modelo = "Fusca"; // Para inicializarmos o atributo da classe usamos essa sintaxe
        carro.placa = "MFP-3707";
        carro.velocidadeMaxima = 120;
        //  variável de referência.atributo
        System.out.println(carro.modelo); // Aqui é para imprimir usamos a variável de referência.atributo
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);

    }
}
