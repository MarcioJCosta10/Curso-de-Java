package br.com.mjcxdev.introducaojava;

/*
* Lembre-se que um array é sempre um objeto
* Lembre-se que você sempre precisa passar a quantidade de espaço que o array irá alocar
* */
public class Aula_20_ArraysParte3 {
    public static void main(String[] args) {
        // Nova forma de inicializar o array
        // 1ª forma
        // int [] numeros = new int [5];

        // 2ª forma:
        //int [] numeros = {1,2,3,4,5}; //tam 5 indice de 0 a 4

        // 3ª forma:
        //int [] numeros = new int []{1,2,3,4,5}; // Não devemos definir o tamanho

        // 4ª forma
        // se for inicializar em linhas separadas temos que informar para o java qual é o tipo desse array
        // double[] notas;
        // notas = new double[]{1,2,3,5}; para evitar ambiguidade

        //Nova forma de iterar sobre o array
        int [] numeros = {1,2,3,4,5};

        //1ª Forma for normal
        //for (int i = 0; i<= numeros.length; i++ ){
        //  System.out.println(numeros[i]);
        //}
        // 2ª Forma após java 5 foreach
        for (int i : numeros   ) {  // A variável i vai representar cada uma das posições do array,
                                    // Não temos iteração numérica, por trs desse código, o java vai pegar cada posição e vai jogar a variável auxiliar
            System.out.println(i);  // irá imprimir 1,2,3,4,5
                                    // Não precisa de lógica e nem incrementar variável
        }                           // Só precisamos saber o tipo da variável
                                    // Essa varíavel tem escopo só dentro do bloco do for e precisa ser criada dentro do for


    }
}
