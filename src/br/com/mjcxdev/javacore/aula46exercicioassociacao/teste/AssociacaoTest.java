package br.com.mjcxdev.javacore.aula46exercicioassociacao.teste;

import br.com.mjcxdev.javacore.aula46exercicioassociacao.classes.Aluno;
import br.com.mjcxdev.javacore.aula46exercicioassociacao.classes.Local;
import br.com.mjcxdev.javacore.aula46exercicioassociacao.classes.Professor;
import br.com.mjcxdev.javacore.aula46exercicioassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        //33 Vamos criar um aluno em um seminário
        // Estamos criando uma variável de referencia do tipo aluno que está referenciando
        // um objeto do tipo aluno
        Aluno aluno = new Aluno("Marcos Vella",27);

        //40 Vou criar outro aluno
        Aluno aluno1 = new Aluno("Emerson",18);

        // 34 Vamos criar o obejto do tipo seminário
        Seminario sem = new Seminario("Como ser um baita programador e ficar rico");

        //35 Agora vou dizer que o aluno Marcos Vella vai participar do seminário: Como ser um baita programador e ficar rico
        aluno.setSeminario(sem);

        // 36 - Agora vou imprimir e vu ver que terá no lugar no seminário o endereço de memória da variável de referencia
        // e que o modo correto é usar this.seminario.getTitulo()

        //37 Agora vamos cadastrar o professor
        Professor prof = new Professor("Ioad","Usar a força para programar");

        // 38 Vamos cadastrar o local
        Local local = new Local("Da Felicidade","Amizade", "SP");

        //63 - Para testar o tratamento da exceção do local comente sem.setLocal(local);
        // 39 Agora vou continuar associando as classes
        // 41 Associando o seminario ao local e ao professor
        sem.setProfessor(prof); // 42 Cadastrando o professor do seminário
        sem.setLocal(local); // 43 Cadastrando o local do seminário

        // 62 - Para fazer um teste da exceção comente sem.setAlunos(new Aluno[]{aluno,aluno1}) como se não tivessemos cadastrados os alunos
        //44 Associando os alunos ao seminário
        sem.setAlunos(new Aluno[]{aluno,aluno1}); //45 Aqui estou associando e colocando no array de alunos


        // 46 Associando os alunos ao seminário
        aluno.setSeminario(sem); // 47 Cadastrando o aluno 1
        aluno1.setSeminario(sem); // 48 Cadastrando o aluno 2

        //49 Associar professor ao seminário
        // Poderia ser assim
        // prof.setSeminarios(new Seminario[]{sem});
        // ou Assim
        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        // Até aqui já temos todas as classes associadas, agora vamos criar um relatório
        // Vá para a classe local


        // 56 Vamos testar
        sem.print();
        prof.print();

        aluno.print();


    }
}
