/*
 *   Herança em java é usado basicamente por dois motivos:
 *   1 - Reaproveitar o código
 *   2 - Usar o Polimorfismo
 *
 *   Não Existe Herança Multipla em Java
 *
 *  O modificador de acesso protected é usado para permitir o acesso aos atributos de uma classe diretamento
 *  por outra classe que está dentro do mesmo pacote ou fora do pacote apenas por classes filhas (subclasses)
 *
 *  Caso você nãoi queira usar o protected pode deixar private e usar os métodos get e set
 *
 * REPRESENTAÇÃO DOS MODIFICADORES DE ACESSO NA UML
 *    + public
 *    - private
 *    # protected
 *
 *  O this sempre está relacionado a classe que você está trabalhando, o proprio objeto;
 *
 *  Ao usar o a palavra super não podemos (.) ponto para separar o método
 *  Devemos usar a mesma regra do this, o super deverá ser a primeira linha em execução dentro do construtor
 *  Não podemos usar o super e o this dentro do mesmo contrutor ou é super ou é o this
 *
 *  Toda classe extende implicitamente a classe Object, toda classe é filha de object
 *
 * */

package br.com.mjcxdev.javacore.aula50heranca.classes;

// 1 -Criando uma classe Pessoa com os atributos
public class Pessoa extends Object {
    protected String nome;
    protected String cpf;
    // 5- Vamos associar a classe endereço a pessoa pois pessoa tem um endereço
    protected Endereco endereco;

    // 21 - Vamos entender como funciona os construtores na herança
    // Nossa classe pessoa até aqui não tem nenhum construtor criado, nesse caso o java está usando o construtor default
    // O que acontece se tivermos um construtor com parâmetros? Nesse caso se o construtor tiver paramentros (é sobrecarregado)

    public Pessoa(String nome){ // criando o construtor com parametros
        this.nome = nome;       // É obrigado a passar esse parametro
    }

    // 25 - digamos que temos outro construtor sobrecarregado
    public Pessoa(String nome, String cpf){
            // 26 Como fazemos para chamar um contrutor da propria classe para não ficar repetindo código ?
            // Chamamos o construtor já existente assim:
            this(nome); // usamos o this e passamos o parametro que está entre parentese
            //this.nome = nome;

            this.cpf = cpf;

    }

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
