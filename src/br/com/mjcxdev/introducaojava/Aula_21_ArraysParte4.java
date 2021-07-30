package br.com.mjcxdev.introducaojava;

/*
* Arrays Bidimensionais
* Cada posição do array vai guardar uma referência para outro array
* Os ultimos arrays é que vão guardar o tipo da variavel definida no array
* A inicialização precisa ser por partes
* */
public class Aula_21_ArraysParte4 {
    public static void main(String[] args) {


    // Digamos que seja para guardar os dias de cada mês sendo que cada mês tem uma quantidade de dias diferentes
    // Para declarar um array bidimensional
    // 1ª forma
    // int [][] dias = new int[12][31];
    //2ª forma
    //int [] dias [] = new int dias [] []; não é aconselhada

    int [][] dias = new int [2][2]; // temos um array de duas posições e cada posição referencia um array de duas posições
    //int[][] dias = new int [array0][array1]
     //                       [0|1]   [0|1]
    // A inicialização precisa ser por partes
        dias[0][0]=30;
        dias[0][1]=31;
        dias[1][0]=29;
        dias[1][1]=28;

       // para imprimir  vamos precisar de dois for por ser bidimensional com for normal
       for(int i = 0; i< dias.length;i++){
         System.out.println(dias[i]); // ao imprimir termos o enderelo de memória
                                        // para chegar a esse array precisamos de outro for e não podemos usar mais o i com ovariável
       for (int j=0; j < dias[i].length; j++){
        System.out.println(dias[i][j]); // Aqui teremos os valores de cada arry
       }
       }
        System.out.println("-----------------------------");

        // para imprimir  com foreach
        for(int[] referencia_para_o_array : dias){
            for(int dia : referencia_para_o_array){
                System.out.println(dia);
            }
        }
    }

}
