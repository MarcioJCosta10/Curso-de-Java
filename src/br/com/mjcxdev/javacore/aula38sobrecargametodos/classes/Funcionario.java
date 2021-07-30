/*
 *   Vamos falar sobre sobrecarga de métodos
 *   A sobrecarga de métodos é quando usamos o mesmo nome porém os paramentros precisam ser diferentes
 *   Na quantidade ou os tipos dos parametros
 *   Lembre-se de ficar atento a códigos duplicados
 *
 * */


package br.com.mjcxdev.javacore.aula38sobrecargametodos.classes;

import com.sun.org.apache.bcel.internal.generic.ArrayElementValueGen;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //Aula 39 criando o construtor, contrutores são rotinas de inicialização e temos que seguir as seguintes regras:
    // Contrutor nunca terá retorno nem void nem nada a regra é modificador de acesso e exatamente o nome da classe
    // Isso é um contrutor
    //public Funcionario(String nome){
       // System.out.println("Dentro do construtor"); // Agora vamos para a classe de teste para executar
                                                    // Veremos que o primeiro código a ser executado será o construtor
                                                    // O Contrutor é util pois podemos definir regras: exemplo
                                                    // Se para todos os fubncionários preciso definir um nome obrigatóriamente
        //this.nome = nome;  // Assim não posso criar o funcionário sem o nome
                            // Ao voltar para a classe de teste teremos um erro pois não exite construtor padrão
                            // Ai precisaremos passar um nome e ao imprimir se não tiver definido nenhum atributo nome, o nome já será impresso
                            // Assim sou obigado a passar u mparamentro na hora da contrução do objeto da classe


   // }

    // Se eu passar como parametro para o meu contrutor o método init na hora da criação do objeto terei que passar todos os paramentreos do metodo init
    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;

    }
  // Podemos fazer também a sobrecarga dos construtores, assim teremos tres maneiras de criar os objetos
  public Funcionario(String cpf, double salario, String rg){
      this.cpf = cpf;
      this.salario = salario;
      this.rg = rg;
    }

    public Funcionario(){

    }



    // Criando Aqui o novo atributo e vamos criar os set e get
    private String rg;

    // Aqui terá o método para imprimir em uma só linha, é como se fosse todos os set em um lugar só
    public void init(String nome, String cpf, double salario) { //String rg
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;

        // Ai você pensa que pode alterar aqui o atributo rg
        //this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.getSalario());

        // Agora vamos alterar o método imprime
        System.out.println(this.getRg());
        // Mas ao testar ele irá imprimir null
    }
    // A solução é criar um outro método ou seja a sobrecarga de métodos
    // A sobrecarga de métodos é quando usamos o mesmo nome porém os paramentros precisam ser diferentes
    // Na quantidade ou os tipos dos parametros
    // O tipo de retorno não interessa ainda

    public void init(String nome, String cpf, double salario, String rg) {
        // Como estamos repetindo código e temos o método init que preenche os valores então vou chamar o init para fazer isso
        init(nome,cpf,salario);

        // Assim posso remover essas linhas repetidas
        //this.nome = nome;
        //this.cpf = cpf;
        //this.salario = salario;
        this.rg = rg;



    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getRg() {
        return this.rg;
    }


}


// Aula 39 vamos falar sobre os construtores
/*
 * Regras - Objetos são contruídos, e os responsáveis por essa contrução são os construtores
 * Todas vez que usamos o nome da classe com a palavra new e se fui apto a contruir a classe significa que essa classe usada tem um contrutor.
 * Vendo o contrutor ou não ele existe, se você não criar um construtor na classe o java irá criar um ao compílar
 * Vamos aprender a criar o construtor
 *
 * Construtores é um código de inicialização que dará origem aos nosso objetos
 *
 *
 */


