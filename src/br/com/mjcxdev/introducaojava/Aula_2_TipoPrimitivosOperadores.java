package br.com.mjcxdev.introducaojava;/*
public class TipoPrimitivosOperadores {
    public static void main(String[] args) {

        int idade =10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = '\u0041';// 95// A na tabela unicode//'A'; // 2 bytes
        String nome = "mjdXdev"; // Tipo references
        System.out.println(caractere);

    }

}

 */


//  EXERCÍCIO 1
//Crie um algoritmo que possua variáveis para salvar os seguintes dados: nome endereço telefone
// Imprima essas variáveis da seguinte forma
// O <nome> domiciliado no endereço <endereco> e telefone <telefone> não possui nenhum tipo de pendencia
public class Aula_2_TipoPrimitivosOperadores {
    public static void main(String[] args) {
        String nome = "mjdXdev";
        String endereco = "Estrada Morro Grande 1418";
        String telefone = "(11)930931589";

        System.out.println("O " + nome + " domiciliado no endereço " + endereco + " e telefone " + telefone + " não possui nenhum tipo de pendencia." );

        float salario = 3000;
        char sexo = 'M';
        int idade = 38;
        String estadoCivil = "Casado";

        System.out.println("O trabalhador " + nome + " do sexo " + sexo + ", idade " + idade + " e estado civil " + estadoCivil +  " encontra-se empregado nesse estabelecimento. "  );


    }

}
    //EXERCÍCIO 2
// Crie um algoritmo que possua as variáveis: nome, salario, sexo [M][F], idade, estado civil;
// Imprima da seguinte forma:
// O trabalhador(a) <nome> do sexo <sexo> idade <idade> estado civil <estadoCivil> encontra-se empregado nesse estabelecimento.