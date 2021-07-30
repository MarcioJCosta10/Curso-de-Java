package br.com.mjcxdev.javacore.aula35exercicioateaqui.teste;

import br.com.mjcxdev.javacore.aula35exercicioateaqui.classe.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        // Aqui vou chamar o metodo para atribuir valor setNome passando o argumento
        aluno.setNome( "Marcos Vella") ;
        //aluno.nome = "Marcos Vella";

        aluno.setIdade(-1);
        //aluno.idade = -1;

        aluno.setNotas(new double[]{1,2,9.5});
        //aluno.notas = new double[]{3,2,9.5};

        // Formas de inicializar o array
        // double [] notas = {2,8,5};
        // aluno.notas = notas;
        // aluno.notas = new double[3];

        // aluno.notas[0]=1;
        // aluno.notas[1]=5;
        // aluno.notas[2]=1;

        aluno.imprimeDadosEstudante();
        aluno.mediaDoEstudante();

        // imprimindo os atributos pelo get
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        //System.out.println(aluno.getNotas());

        // Aula 37 agora temos um atributo a mas não podemos acessar ele aqui dessa classe pois é privado
        //aluno.aprovado;
        System.out.println("Aprovado" + aluno.isAprovado());

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



