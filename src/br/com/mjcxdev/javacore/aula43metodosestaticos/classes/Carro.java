/*
*  Agora vamos tratar sobre métodos estáticos
*   Métodos estáticos, da mesma forma dos atributos, pertencem a classe e não ao objeto
*   Como métodos estáticos e atributos estáticos pertencem a classe mesmos antes de exitir objetos na memória,
*   poderemos modificar esses valores
*   Não podemos acessar atributos não estáticos através de métodos estáticos pois esses atributos não estáticos
*   só serão criados dentro do objeto
*
*   Regra: se você não está acessando atributo de classe, se estivermos apenas recebendo parametros podemos
*   transformar esse método em estático
*
*
* */

package br.com.mjcxdev.javacore.aula43metodosestaticos.classes;
    // Classe
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240;

    //Contrutor
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    //Contrutor
    public Carro() {

    }
    // 1 - Criando o método set estático
        public static void setVelocidadeLimite(double velocidadeLimite){
        // this.velocidadeLimite = velocidadeLimite; -- Não podemos usar o this. pois ele está associado a um objeto
            // 6 - Para resover a questão do escopo da variável usaremo o seguinte
        Carro.velocidadeLimite = velocidadeLimite;
            // 7 Assim o valor será atribuido a classe e não ao objeto cia this

        }
    // 2- Criando o método get estático
        public static double getVelocidadeLimite(){
        return velocidadeLimite;
        }
    // 3 - Vamos ver o que acontece na classe teste ao tentar mudar o valor

    public void imprime() {
        System.out.println("---------------------------");
        System.out.println("Marca do carro " + this.nome);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + velocidadeLimite);
    }


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
}
