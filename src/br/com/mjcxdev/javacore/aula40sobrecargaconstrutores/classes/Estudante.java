/*
    Regras:
*   Construtores não tem retorno nem mesmo void
    Só podemos chamar um construtor dentro de outro construtor
    Se for chamar um construtor dentro de outro construtor, obrigatóriamente precisa ser a primeira linha
    dentro do bloco do construtor

*
*
* */


package br.com.mjcxdev.javacore.aula40sobrecargaconstrutores.classes;

import sun.security.mscapi.CPublicKey;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;

    // 5 Imagine se criarmos outro atributo para a classe Estudante
    // Não podemos colocar esse atributo dentro do construtor pois quebraremos o código de todos que estão usando a classe estudante

    private String dataMatricula;

    // 1 - Criando o construtor inicializando todos os valores
    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    //6 - Para resolver criamos um outro construtor e adicionamos o atributo desejado
    //public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
      //  this.matricula = matricula;
        //this.nome = nome;
        //this.notas = notas;
        //this.dataMatricula = dataMatricula;
    //}

    // 7 - Mas ai estaremos repetindo código, então podemos colocar um construtor dentro de outro construtor? Sim!
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
        // 8 - temos uma forma especial de chamar um contrutor dentro de outro construtor
        //9 -this(); // nesse caso como não passamos parametro dentro dos parenteses do this, o java vai chamar o contrutor sem paramentros
        //10 - Mas não quero repetir códigos então vou passar os paramentros para detro do this
        this(matricula,nome,notas); // Precisa exatamente os mesmo argumentos
        // 11 ai podemos remover as linhas abaixo
        //this.matricula = matricula;
        //this.nome = nome;
        //this.notas = notas;

        // 12 - E coloco o atributo novo
        this.dataMatricula = dataMatricula;
    }

   // 2 - Vamos sobrecarregar o contrutor para não forçar a inicializar com todos os paramentros
      // Sem parametros
   public Estudante(){
       System.out.println("Construtor Default");

      }

    // 3- Criar o método imprime
    public void imprimir() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double nota : notas){
            System.out.println(nota + " ");
        }
        System.out.println(this.dataMatricula);
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
