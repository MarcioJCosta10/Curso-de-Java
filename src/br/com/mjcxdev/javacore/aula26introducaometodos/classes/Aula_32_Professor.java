/*
 *   Lembre-se a palavra this é usada quando queremos pegar os valores de dentro do próprio objeto
 *   this diz implicitamente para pegarmos o valor do próprio objeto, do próprio endereço de memória
 *   na qual o objeto se encontra
 *
 * */

package br.com.mjcxdev.javacore.aula26introducaometodos.classes;

public class Aula_32_Professor {
   // Criando os atributos da classe
    public String nome;
    public String rg;
    public String matricula;
    public String cpf;

    // Criando o método imprime com o this
    public void imprime(){
        System.out.println("--------------------");
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);

    }

}
