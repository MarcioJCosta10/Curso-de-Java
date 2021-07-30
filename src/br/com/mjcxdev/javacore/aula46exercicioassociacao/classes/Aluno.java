package br.com.mjcxdev.javacore.aula46exercicioassociacao.classes;

// 1 Criando a classe aluno
public class Aluno {
    // 2 Criando os atributos
    private String nome;
    private int idade;

    private Seminario seminario;    // 21 Começando as associações
    // Um aluno só poderá estar em um seminário

    /*31 CRIANDO O MÉTODO IMPRIME PARA A CLASSE ALUNOS*/
    public void print() {
        System.out.println("____________________Relatório de alunos____________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        //System.out.println("Seminário: "+ this.seminario); // 37 aqui faremos a correção pois queremos pegar o titulo do obejto seminário
        //38 e testar
        //39 vamos tratar a exceção caso não tivermos objeto
        if (this.seminario != null) {
            System.out.println("Seminário: " + this.seminario.getTitulo());
        } else {
            System.out.println("Aluno não está inscrito em nenhum seminário");
        }
    }

    // 4 Criando os construtores com atributos
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // 5 Criando construtores sem os atributos
    public Aluno() {
    }

    // 3 Criando o s get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() { //22- Criando os get e set para seminário na classe aluno
        return seminario;
    }
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
