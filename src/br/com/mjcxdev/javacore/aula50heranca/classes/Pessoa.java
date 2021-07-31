/*
 *   Herança em java é usado basicamente por dois motivos:
 *   1 - Reaproveitar o código
 *   2 - Usar o Polimorfismo
 *
 *   Não Existe Herança Multipla em Java
 *
 *
 * */

package br.com.mjcxdev.javacore.aula50heranca.classes;

// 1 -Criando uma classe Pessoa com os atributos
public class Pessoa {
    private String nome;
    private String cpf;
    // 5- Vamos associar a classe endereço a pessoa pois pessoa tem um endereço
    private Endereco endereco;

    //13 - Criando o método imprime
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("Bairro: " + this.endereco.getBairro());
    }

    // 6 - Criar get e ser para endereço

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    //3 - Criar gett and sett

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
