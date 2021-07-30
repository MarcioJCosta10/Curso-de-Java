package br.com.mjcxdev.javacore.aula43metodosestaticos.teste;

import br.com.mjcxdev.javacore.aula43metodosestaticos.classes.Carro;

public class CarroTeste {
    // 12 - Se criarmos  um novo atributo fora do main para a classe , para conseguir acesar dentro de um método main que é static estático temos que definir esse novo atributo como
    // estático;
    // Assim ele pertencerá a classe
    private static String teste;

    public static void main(String[] args) {
        System.out.println(teste);
        // 4 - Aqui vamos atribuir a velocidadeLimite atraves do métod set estático

        Carro.setVelocidadeLimite(220);
        // 9 - Comentei todod as outras linhas e vamos fazer o seguinte
        System.out.println(Carro.getVelocidadeLimite() );// 9- Ai percebermos que mesmo sem nenhum objeto criado temos o valor de  220;
                                                         // 9 - Então se não temos objetos criados e podemos buscar o valor e alterar é porque
                                                         // 9 métodos estáticos podem acessar atributos que ainda nem forma criados  na memória.
        // 10 - Como métodos estáticos e atributos estáticos pertencem a classe mesmos antes de exitir objetos na memória, poderemos modificar esses valores
        // 11 - Um exemplo é na classe calculada que poderemos transformar todos os método em métodos estáticos
        // 11 - Pois não temos stributos

        // 5 - veremos que ainda assim permanece o valor de 240 definido na classe
        // Porque isso acontece?
        // É por causa do escopo da variável velocidade limite, pois ojava vai dar prioridade para variável do escopo mais próximo

        // 8 ao imprimir veremos que após essa modificação está funcionando

        // 9 -Pergunta? Dentro de métodos estáticos podemos acessar atibutos não estáticos?
        // 9 - Não podemos acessar atributos de classes dentro de métodos estáticos

         Carro c1 = new Carro("BMW", 280);
         Carro c2 = new Carro("Audi", 275);
         Carro c3 = new Carro("Mercedes", 290);


        c1.imprime();
        c2.imprime();
        c3.imprime();
        System.out.println("#################################");


        c1.imprime();
        c2.imprime();
        c3.imprime();

        // Aula 43
        // Na aula passada vimos que não é uma boa ideia acessar o atributo estatico pelo nome do objeto pois o
        // o atributo estático pertence a classe e se alterar em um alteramos em todos
        // Para isso podemos usar os métos estáticos

    }
}