package br.com.mjcxdev.javacore.aula40sobrecargaconstrutores.teste;

import br.com.mjcxdev.javacore.aula40sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        // Criando o objeto e passando os parametros do contrutor com paramentros
        Estudante est = new Estudante("AA2412", "Carlitos", new double[]{5,7,9},"13/04/2016");
        est.imprimir();

    }
}
