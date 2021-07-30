package br.com.mjcxdev.javacore.aula38sobrecargametodos.testes;

import br.com.mjcxdev.javacore.aula38sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva", "064.554.616-06", 5500, "56625666");
        Funcionario funcionario1 = new Funcionario(); // ao usar ctrl + p veremos os construtores possíveis
        funcionario1.imprime();
        //funcionario.setNome("Chica da Silva");
        //funcionario.setCpf("064.554.616-06");
        //funcionario.setSalario(4500);

        // Ai após corrigir o metodo init vou corrigir aqui
        // Porém imagine que temos uma equipe usando essa classe, assim quebraremos o código da equipe inteira
        // Que está usando o metodo init, então não é interessante alterar a assinatura de um método dessa forma
        // Qual será a solução? Vamos para a classe

        //funcionario.init("Chica da Silva", "064.55.616-06", 4500); //rg:5656565

        // Voltando ao chamar o método o java vai identificar em tempo de compilação de qual método se trata
        // e que se melhor se adequa a lista de párametros que estamos passando
        funcionario.init("Chica da Silva", "064.554.616-06", 5500, "56625666");

        // Porém ainda estamos repetindo código, vamos a classe


        funcionario.imprime();

        // Até aqui legal, mas não é chato termos que usar tres linhas para visualizarmos os nossos valores?
        // Podemos usar a sobrecarga de métodos
        // Vamos para dentro da classe

        // Após criar o método vamos chamá-lo para imprimir usando o init
        // funcionario.init("Chica da Silva", "064.55.616-06", 4500);

        // Digamos que agora após terminar o sistema  o chefe chega e fala para adicionarmos um atributo a classe funcionário
        // Vamos para dentro da classe
    }
}
