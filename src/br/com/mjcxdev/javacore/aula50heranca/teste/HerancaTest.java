package br.com.mjcxdev.javacore.aula50heranca.teste;

import br.com.mjcxdev.javacore.aula50heranca.classes.Endereco;
import br.com.mjcxdev.javacore.aula50heranca.classes.Funcionario;
import br.com.mjcxdev.javacore.aula50heranca.classes.Pessoa;

// 10 Iniciando o teste criando a classe HerancaTest
public class HerancaTest {
    public static void main(String[] args) {
        // 11 - Criando os obejtos p, end e Funcionário e inicializando os atributos
        Pessoa p = new Pessoa("Marcos Vella");
        Endereco end = new Endereco();

        p.setNome("Marcos Vella");
        p.setCpf("12345");
        end.setRua("Estrada Morro Grande");
        end.setBairro("Jardim Isis");

        //12 - Associando o endereço a pessoa
        p.setEndereco(end);

        //13- vamos fazer o método imprime em pessoa
        // 14- Tesntando método imprime
        p.imprime();
        System.out.println("___________________________________________");

          //15 Agora vamos ver que na classe funcionário só existe u matributo explicito mas ele herdou os método e atributos da classe pessoa
        Funcionario f = new Funcionario("Emerson");
        f.setNome("Emersom");
        f.setCpf("9675");
        f.setSalario(15000);
        f.setEndereco(end);
        //16- Ao imprimir como fazemos para imprimir o atributo sálario que é unico dentro da classe Funcionário?
        f.imprime();

        // 27 Se analisarmos vamos perceber que a classe herança possui métodos que você não criou mas que pertence a classe Object
        //p.

    }
}
