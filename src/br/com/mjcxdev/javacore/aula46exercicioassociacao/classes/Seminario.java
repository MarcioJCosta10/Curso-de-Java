package br.com.mjcxdev.javacore.aula46exercicioassociacao.classes;

// 6 Criando a classe seminário
public class Seminario {
    //7 Criando o atributo
    private String titulo;

    private Aluno[] alunos; //23 Criando um array para os vários alunos no seminário
    private Professor professor; //25 Criando o atributo professor e será só um por seminário
    private Local local; //29 Criando o atributo local para a classe Seminário

    /* 32 CRIAR O METODO IMPRIME PARA SEMINÁRIO*/
    public void print() {
        System.out.println("____________________Relatório de Seminários____________________");
        System.out.println("Titulo: " + this.titulo);

        // Daqui vamos testar em associacaoTest
        // 54 Continuando com o método print da Classe seminário
        System.out.println("Professor Palestrante: " + this.professor.getNome());

        //60 Tratando a possibilidade de erro noPointException para local
        if (this.local != null) {
            System.out.println("Local, rua: " + this.local.getRua() + " bairro " + this.local.getBairro() + " Estado " + this.local.getEstado() + " ");
        } else {
            System.out.println("Local não vinculado para esse seminário");
        }
        //61 - Tratando a possibilidade de erro noPointException para alunos
        if (this.alunos != null && alunos.length != 0) {
            // 55 como é um array para imprimir os alunos preciso usar um for
            System.out.println("____________Alunos Participantes____________");
            System.out.println();
            for (Aluno alu : alunos) {
                System.out.println("Aluno Participantes: " + alu.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }

    //9 Criando o construtor com atributos
    public Seminario(String titulo) {
        this.titulo = titulo;
    }
    //10 Criando o construtor sem os atributos
    public Seminario() {
    }

    public Local getLocal() { //30 Criando os get e set para o atributo local em seminários
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    //8 Criando os get e set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() { //24 Criando os get e set dos varios alunos no ceminário
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() { //26  Criando os get e set para o professor do seminário
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
