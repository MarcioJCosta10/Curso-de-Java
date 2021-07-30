/*  Exercício
 *   Deverei criar um sistema que gerêncie seminários:
 *   Deverá cadastrar seminários, alunos, professores, local:
 *   Um aluno deverá estar em apenas um seminário
 *   Um seminário poderá ter nenhum ou vários alunos
 *   Um professor poderá ministrar um ou vários seminários
 *   Um seminário só poderá ter um professor
 *   Um Seminário deverá ter um local
 *
 *   Atributos:
 *   Seminário - titulo
 *   Aluno: Nome e idade
 *   Professor: Nome e especializadade
 *   Local: Rua, Bairro, Estado
 *
 *
 *
 *
 * */
package br.com.mjcxdev.javacore.aula46exercicioassociacao.classes;

//11 Criando a classe local
public class Local {
    //12 Criando os atributos
    private String rua;
    private String bairro;
    private String estado;

    // 50 Vamos criar o método print
    public void print(){
        System.out.println("____________________Relatório de local____________________");
        System.out.println("A rua: "+ this.rua);
        System.out.println("O bairro: "+ this.bairro);
        System.out.println("O estado: "+ this.estado);

    }

    // 14 Criando o construtor com atributos
    public Local(String rua, String bairro, String estado) {
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
    }
    // 15 Criando o construtor sem atributos
    public Local() {
    }

    //13  Criando os get e ser
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
