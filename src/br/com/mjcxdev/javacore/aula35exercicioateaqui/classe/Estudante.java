/*
 *  Crie uma classe estudante com os seguintes atributos
 *   nome
 *   idade
 *   notas // Aqui devo guardar tres notas
 *
 *   Crie um método para imprimiri os dados
 *   Crie um método para tirar a média desse aluno
 *   Caso a média seja maior que 6 imprimir aprovado se não aprovado
 *
 *
 *
 * */

package br.com.mjcxdev.javacore.aula35exercicioateaqui.classe;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Estudante {
    //public String nome;
    private String nome;
    //public int idade;
    private int idade;
    //public double[] notas;
    private double[] notas;

    // Aula 37 aqui
    private boolean aprovado;

    public void imprimeDadosEstudante() {

        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        if (this.notas != null) {            // Aqui estou tratando caso as notas sejam nulas
            for (double cadaNota : this.notas) { // a prioridade será sempre para as variáveis mais próxima
                // se por acaso tivesse outra variavel aqui chamada nota daria erro
                // para isso é importante usar a palavras this
                System.out.print(cadaNota + " ");
            }
        }
    }

    public void mediaDoEstudante() {
        if (this.notas == null) {  // Aqui estou tratando caso as notas sejam nulas
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for (double cadaNota : this.notas) {
            media += cadaNota;
        }
        media = media / notas.length;


         if (media >= 6) {
             // Aula 37 aqui
             // podemos pegar o atributo e usar ele aqui no if
             // dentro do método médiaEstudante no if ele vai guardar no atributo aprovado se o aluno foi aprovado ou não
             this.aprovado = true; // Podemos pegar o proprio atributo dentro da classe mesmo que seja private
            System.out.println("\nA média é: " + media + " situação: Aprovado");
        } else {
             this.aprovado = false;
            System.out.println("\nA média é: " + media + " situação: reprovado");

        }
    }

    /* AULA 36  - Vamos continuar falando dessa classe estudante
     Vamos falar de acoplamento quanto uma classe está relacionada com outro
     Quanto mais acoplamento pior
    Baixo acoplamemto uma classe não afeta tanto a outra classe é bom

     O que acontece se o usuário digitar -1 no atributo aluno.idade = -1;?
     a idade irá passar com -1 ao imprimir isso é porque nosso objeto tem um acoplamento muito forte com a classe
     isso é ruim
     o que temos que fazer é começar a pensar em encapsular os atributos da classe
     como fazer isso?

     public - temos o modificador de acesso que permite o atributo ser visto por outras classes
     porém queremos proteger esses atributos
     queremos que esse atributo passe por um método para em seguida ele ser preenchido dentro do objeto

      Teremos o private -
      significa que os atributos da classe só será visivel para dentro da classe estudante
      se tentarmos acessar esses atributos em um objeto dessa classe dará erro pois é para não ser visto

       Para conseguirmos utilizar esses atributos em outros objetos temos os métodos get e set

      */
// Vamor aprender como colocar valores nesses atributos
    // Temos os métodos para atribuir valores
    //modificador    //sem retor   // convenção  // parametro esperado
    public            void         setNome      (String nome) {
        //this. para dizer que o atributo e dessa classe que vai receber um argumento
        this.nome = nome;
    }                               // digamos que não quero permitir que entre com uma idade // basta remover o set
    public void setIdade(int idade){
        if (idade <= 0){
            System.out.println("Voce não pode fazer isso"); // podemos fazer a validação
            return;
        }
        this.idade = idade;
    }
    public void setNotas(double[]notas){
        this.notas=notas;
    }
    // para buscar os valores chamo esses métodos lá no objeto

    // E se eu precisar somente pegar o valor sem precisar imprimir?
    // Preciso criar o método para buscar os valores
    // Temos o get para buscar

    // modificador  // retorno   // nome convenção
    public          String       getNome(){
        // retorno esperado do método.
        return this.nome;
    }
    public int getIdade(){ // digamos que não quero permitir que entre idade negativa
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
        // Agora la no objeto conseguiremos imprimir os atributos
    }

// Aula 37 vamos continuar falando dos modificadores de acesso e dos get e set
/*
 *  Vamos falar do modificador de acesso private para os booleans
 *   *
 *
 * */
             // vamos criar modificadores de acesso para aprovado
             // como vamos colocar uma valor precisamos passar os parametros
             // Não poderemos ter o método set para o atributo aprovado pois
             // a responsabilidade de dizer se está aprovado ou reprovado é do método tirar média
             // Assim não temos a possibilidade de alterar o valor do aprovado sem passar pelo método tirar média
             // public void setAprovado(boolean aprovado){
             // this.aprovado = aprovado;
    //}
        //public boolean getAprovado() para valores booleanos não usamos o get e sim o is como convenção para nome de métodos
        public boolean isAprovado(){
            return this.aprovado;
        }

        // então se não quisermos que um atributo seja modificado não devemos criar o método set para ele
}







