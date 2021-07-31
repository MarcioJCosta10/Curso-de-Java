/* Ao analizarmos percebemos que Funcionário é tbm uma Pessoa, Funcionário é uma extensão de Pessoa
   pois tem algumas funcionalidades a mais:
   Para fazer uma extensão em Java usamos a palavra extend seguido do nome da classe

*
*
*
* */


package br.com.mjcxdev.javacore.aula50heranca.classes;

// 7 Suponhamos que vamos criar uma classe Funcionário, veremos que vamos repetir alguns atributos e terá outros

public class Funcionario extends Pessoa { //8 A realizar o extend podemos remover os atributos repetidos
    // Agora Funcionário É UMA Pessoa
    //private String nome;
    //private String cpf;
    //private Endereço endereço;
    private double salario;
    //16- Como imprimir os dados de pessoa e os dados de funcionário?
    //16 - Existe um conceito chamado de Sobrescrita de métodos, como fuinciona?
    // 16 - Vamos criar o metodo com o mesmo modificador de acesso e tipo de retonrno e mesmo nome e mesma qtd de parametros
    public void imprime(){
        //17 - como chamar o método da classe mae que é a super classe? usamos a palavra super
        super.imprime();
        //18 - após incluir dentro desse método sobrescrito podemos também imprimir no mesmo método novo o atributo salário
        System.out.println("Salario"+ this.salario);
    }



    //9 - Criando os gett e sett

    //public String getNome() {
    //  return nome;
    //}

    //public void setNome(String nome) {
    //  this.nome = nome;
    //}

    //public String getCpf() {
    //  return cpf;
    //}

    //public void setCpf(String cpf) {
    //  this.cpf = cpf;
    //}

    //public Endereço getEndereço() {
    //  return endereço;
    // }

    //public void setEndereço(Endereço endereço) {
    //  this.endereço = endereço;
    //}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
