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

    //22- Se usamos um construtor diferente na superclasse somos obrigados a especificar na subclasse que construtor devemos chamar:
    // Criando o seguinte construtor
    public Funcionario(String nome){// 23 temos que passar o parametro usado ao construir
        super(nome);     //24 temos que chamar o construtor da superclasse, e como chamamos? usamos o super
                         //24 Aqui dentro do super podemos definir o contrutor que queremos
                         // 24 O java vai identificar qual é o construtor que estamos chamando de acondo com os argumentos passados no super



    }

    //16- Como imprimir os dados de pessoa e os dados de funcionário?
    //16 - Existe um conceito chamado de Sobrescrita de métodos, como fuinciona?

    // 16 - Vamos criar o metodo com o mesmo modificador de acesso e tipo de retonrno e mesmo nome e mesma qtd de parametros

    public void imprime(){

        //17 - como chamar o método da classe mãe que é a super classe? usamos a palavra super
        super.imprime();
        //18 - após incluir dentro desse método sobrescrito podemos também imprimir no mesmo método novo o atributo salário
        System.out.println("Salario: "+ this.salario+"0");
        //20 aqui chamaremos o método imprimeReciboPagamento() dentro do método imprime da classe funcionário
        imprimeReciboPagamento();
    }

 // 19 Agora imagine que na classe funcionário precisamos imprimir um recibo
    // Vamos criar o método:
    // Aqui percebemos que como o modificador de acesso do atributo está private não conseguimos acessar
    // Então vamos mudar o modificador de acesso dos atributos classe Pessoa para protected, assim somente os filhos da classe e quem estiver no pacote terá acesso a esse atributo

    public void imprimeReciboPagamento(){
        System.out.println("Eu "+ super.nome + " recebi o pagamento de "+ this.salario +"0!");

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
