/*
 *   Vamos falar sobre modificador de acesso static
 *   Um atributo static é um atributo que está associado a classe e é compartilhado com todos os objetos dessa classe
 *
 *
 * */

package br.com.mjcxdev.javacore.aula42modificadorestatico.classes;

// 1 - Criando a classe e seus atributos
// Imagine que tem uma lei para limitar a velocidade dos veículos, velocidadeLimite deve ser de 240km/4
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240; //2 -Vamos inicializar com a velocidade limite
                                                  // 12 - Aqui o atributo velocidadeLimite é vinculado a classe e não aos obejtos
                                                  // 13 - Vamos imprimir agora e ver que alterando uma vez muda em todos os objetos
                                                  // 14 Por enquanto vamos mudar de private para public
    // 4 - Criando oconstrutor com os atributos nome e velocidade limite

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // 5 - Criar um contrutor padrão
    public Carro() {

    }

    // 7 Criando o método imprime
    public void imprime() {
        System.out.println("---------------------------");
        System.out.println("Marca do carro " + this.nome);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + velocidadeLimite); // 15 - this.velocidadeLimite - Aqui removemos o this pois atributo static faz referência a Classe e não ao objeto
    }


    //3 - Criando os get e set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // 14 - Temos que remover os get e set do atributo static
    // 14- public double getVelocidadeLimite() {
    // 14- return velocidadeLimite;
    //14-}

    // 14-public void setVelocidadeLimite(double velocidadeLimite) {
    //14- this.velocidadeLimite = velocidadeLimite;
    //14-}
}
