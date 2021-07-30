package br.com.mjcxdev.javacore.aula42modificadorestatico.teste;

import br.com.mjcxdev.javacore.aula42modificadorestatico.classes.Carro;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class CarroTeste {
    public static void main(String[] args) {
        // 6- Criando 3 objetos
         // 16 - Então antes mesmo de criar os objetos podemos setar a velocidade limite
        Carro.velocidadeLimite = 220;

        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Audi",275);
        Carro c3 = new Carro("Mercedes",290);

        //8 chamando o método imprime
        c1.imprime();
        c2.imprime();
        c3.imprime();
        System.out.println("#################################");

        // 9 - Digamos que a lei mudou e precisamos alterar a velocidade limite

        // 14 - Porém é muito problemático acessar o atributo através do obejto e os atributos estáticos são acessados pela classe
        // 14 -c1.setVelocidadeLimite(220);
            //Carro.velocidadeLimite = 220;

        // 10 - Vamos chamar o metodo imprime agora com a alteração
        c1.imprime();
        c2.imprime();
        c3.imprime();

        // 11 - Aqui temos um problema pois alteramos o atributo de um objeto somente
        //      Precisamos de um modo que o atributo seja independente de objeto é isso que o modificador static faz
        //      ele torna o atributo algo vinculado a classe e não atrelado ao obejto em memória

    }
}
