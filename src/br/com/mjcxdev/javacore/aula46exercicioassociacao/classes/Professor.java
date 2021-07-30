package br.com.mjcxdev.javacore.aula46exercicioassociacao.classes;

//16 Criando a classe professor
public class Professor {
    //17 Criando os atributos
    private String nome;
    private String especialidade;

    private Seminario[] seminarios; // 27 Criando o atributo seminários da classe professor e serãoi varios por isso um array

    // 51 Criando o método print professor
    public void print() {
        System.out.println("____________________Relatório de Professores____________________");

        System.out.println("Nome do professor" + this.nome);
        System.out.println("Especialidade" + this.especialidade);

        //57 Tratando um possibilidade de erro não tenhamos um objeto sendo referenciado pela variável de referencia seminarios
        // Se acontecer isso ao chamar qualquer método ou váriavel resultará em nopointexception erro em tempo de execução pois estamos tentando acessar uma informação que não existe
        if (seminarios != null && seminarios.length != 0) {
            System.out.println("Seminário Participantes");

            //52 como é um array de seminário temos que usar um for para imprimir
            for (Seminario semi : seminarios) {
                System.out.println("Seminário" + semi.getTitulo() + " ");// 53 aqui no seminário quero imprimir o titulo
            }
            //58 Precisamos dar um return ou else e precisa ser fora do for
            return;
        }
        //59 Mensagem que será impressa caso tenha erro
        System.out.println("Professor não vinculado a nenhum seminário");
    }

    //19 Criando o construtor com atributos
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    //20 Criando o construtor sem atributos
    public Professor() {
    }

    public Seminario[] getSeminarios() { // 28 Criando os get e set para Seminário na classe professor
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    //18 Criando os get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
