package br.com.mjcxdev.introducaojava;/* Arrays multidimensionais
    Quando esivermos trabalhando com arrays multidimensionais o unico array que precisamos declarar o tamanho é
    Array de referência de inicio, os outros array podemos ter de tamanhos diferentes
*/


public class Aula_22_ArraysParte5 {
    public static void main(String[] args) {
        // Comentei essa inicialização para inicializar o arra de outra forma
        // int[][] dias = new int [3] []; // preciso declarar o tamanho do array inicial
        //            [array0- array1- array2]
        //            [0-0] [0-0-0][0-0-0-0]  // Agora posso criar arrays de tamahos diferentes


        //dias[0]= new int[2];
        //dias[1]= new int[]{1,2,3}; // podemos inicializar assim
        //dias[2]= new int[4];

        // Aqui é outra forma de inicializar um array multidimensional
        //             [array0 - array1- array2]
        //             [0-0]    [0-0-0]  [0-0-0-0]
        int [][] dias = {{0,0}, {1,2,3}, {0,0,0,0}};// Aqui temos o array que está referenciando outros 3 arryas
                                   // Agora as posições coloco dentro das chaves

        // Para percorrer agora podemos usar o for
        for (int[]arr: dias){ // como temos um array fazendo referencia para outros arrays dentro do foreach temos que ter uma vairiavel de array

           //Qual é o valor da posição [1][2]? O valor é 3
            for(int numeros : arr) {
                System.out.println(numeros);
            }
        }
    }
}
