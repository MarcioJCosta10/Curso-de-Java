package br.com.mjcxdev.javacore.aula50heranca.teste;

import br.com.mjcxdev.javacore.aula50heranca.classes.Endereco;
import br.com.mjcxdev.javacore.aula50heranca.classes.Funcionario;
import br.com.mjcxdev.javacore.aula50heranca.classes.Pessoa;

// 10 Iniciando o teste criando a classe HerancaTest
public class HerancaTest {
    public static void main(String[] args) {
        // 11 - Criando os obejtos p, end e Funcionário e inicializando os atributos
      //32  Pessoa p = new Pessoa("Marcos Vella");
        Endereco end = new Endereco();

        //32 p.setNome("Marcos Vella");
        //32 p.setCpf("12345");
        end.setRua("Estrada Morro Grande");
        end.setBairro("Jardim Isis");

        //12 - Associando o endereço a pessoa
        //32 p.setEndereco(end);

        //13- vamos fazer o método imprime em pessoa
        // 14- Tesntando método imprime
        //32 p.imprime();
        System.out.println("___________________________________________");

          //15 Agora vamos ver que na classe funcionário só existe u matributo explicito mas ele herdou os método e atributos da classe pessoa
        Funcionario f = new Funcionario("Emerson");
        f.setNome("Emersom");
        f.setCpf("9675");
        f.setSalario(15000);
        f.setEndereco(end);
        //16- Ao imprimir como fazemos para imprimir o atributo sálario que é unico dentro da classe Funcionário?
        //32 f.imprime();

        // 27 Se analisarmos vamos perceber que a classe herança possui métodos que você não criou mas que pertence a classe Object
        //p.
        //32 Executando o código para ver a ordem de inicialização, vamos criar apenas a classe Funcionário

/*

Bloco de inicialização estático de Pessoa  -  Será executado apenas uma vez se criarmos outros objetos -- Pesoa é superClasse
Dentro do bloco de inicialização estático de funcionário 1 - Ao iniciar a classe funcionário primeiro será executado o BIS de super de pois BIS da filha
Bloco de inicialização de Pessoa 1 -  Depois volta para fazer tudo que tiver que fazer na superClasse
Bloco de inicialização de Pessoa 2
Dentro do construtor da Classe Pessoa - Só depois vai para a classe funcionário
Dentro do bloco de inicialização de funcionário 1
Dentro do bloco de inicialização de funcionário 2
Dentro do construtor de funcionário

 */
    }
}
