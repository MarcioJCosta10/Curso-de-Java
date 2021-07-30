package br.com.mjcxdev.introducaojava;/*
    Operador ternário
    Foi criado para simplificar instrções if else
    Não se deve usar operador ternário em mais do que uma instrução
    Os valore que serão atribuidos devem ser do mesmo tipo da variavel que irá receber

 */

public class Aula_11_ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 15;
        String status;
        //        boolean         <true>     <false>
        status = (idade >= 18) ? "Adulto" : "Não Adulto";
        //System.out.println("A sua categoria é " + status);



    //EXERCÍCIO
/*
    Crie um programa onde você terá uma variável chamada salário; float salario;
    Crie uma tabela de imposto criando if else
    Imposto:
    Se salario <= 1000            terá 5% de imposto
    Se salario >= 1000 && <= 2000 terá 10 % de imposto
    Se salario >= 2000 && <= 4000 terá 15% de imposto
    Se salario >  5000            terá 20% de imposto

*/
        double salario = 3500;
        double imposto = 0;
        String categoria;
        if (salario <= 1000){
            imposto = salario * 0.05;
        }else if (salario >= 1000 && salario <= 2000){
            imposto = salario * 0.10;
        }else if (salario > 2000 && salario<=4000){
            imposto = salario * 0.15;
        }else{
            imposto = salario * 0.20;
        }
       categoria = (imposto > 100) ? "está lascado"  : "ainda irá se lascar" ;
        System.out.println("O total de imposto é "+ (imposto));
        System.out.println("O seu salario será de " + (salario - imposto) + " e sua categoria é " + (categoria));

    }}
/*
    Sempre que tivermos if lincado com else if o java vai executar e na primeira condição verdadeira ele para de entrar no if
    Se tiver if independente ele irá verificar if por if entrando em todos

 */
