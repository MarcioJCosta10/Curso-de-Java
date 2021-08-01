/*
*  Até aqui temos que ter em mente que para a sobrescrita de metodos temos que ter o mesmo modificador de acesso
*  ou um modificador de acesso menos restrito
*  Temos que ter o mesmo tipo de retorno ou um retorno co variante, o mesmo nome e a mesma quantidade de paramentros
*
*
*
* */



package br.com.mjcxdev.javacore.aula55sobrescritademetodos.classes;

// Vamos tratar sobre a sobrescrita de métodos Override

public class Pessoa extends Object { // 4 Toda classe é filha de Object
    // 1- Criando os atributos
    private String nome;
    private String idade;

    // 6 Sabendo que a classe pessoa herdou o metodo toString da classe Object podemos sobrescreve-lo
    // Na Sobrecarga de metodos não importava se o mofificador de acesso e o tipo de retorno fosse alterado
    // Na sobrescrita isso importa então o metodo para ser sobrescrito precisa ser assinado igual ao nome de origem na superclasse

   //@Override // Para deixar mais explicito que houve a sobrescrita
    //7 Agora devemos efetuar as modificações e testar
    //public String toString(){
      //   return  "O nome é " + nome + " e a idade é idade " + idade + " anos";
    //}

    // 9 - Se usarmos o alt insert o intellij vai criar um modelo padrão de sobrescrita do toString


    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade='" + idade + '\'' + '}';
    }

    //2- Criando os get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
