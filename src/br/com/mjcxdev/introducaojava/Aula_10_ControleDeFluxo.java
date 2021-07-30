package br.com.mjcxdev.introducaojava;

import javax.sound.midi.Soundbank;

public class Aula_10_ControleDeFluxo {
    public static void main(String[] args) {

        // dentro do if precisamo de um valor booleano
        // Se tiver só uma instrução não precisa das chaves mas a boa prática é colocar chaves


        int idade = 17;
        float salario = 2000f;

        if(idade >= 18){ // As variáveis precisam ser comparadas
            System.out.println("Entrou no clube");
        } else{
            // Else é uma possível não condição
            System.out.println("Não pode entrar no clube");
        }

        //(Vamos criar uma regra de negócio)
        /*
            idade < 15 categoria infantil
            idade >= 15 && idade < 18 juvenil
            idade >= 18 adulto
         */

        int idade2 = 18;
        String categoria;  // Toda vez que declarmos uma variável local ela precisa ser inicializada, caso contrario erro de compilação;
        if ( idade2 < 15){
            categoria = "infantil";
        }else if ( idade2 >= 15 && idade2 < 18 ){
            categoria = "Juvenil";
        }else {
            categoria = "Adulto";
        }
        System.out.println("A sua categoria é "+ categoria);

    }
}
