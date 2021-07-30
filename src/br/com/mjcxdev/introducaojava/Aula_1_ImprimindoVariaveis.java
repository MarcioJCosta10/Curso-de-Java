package br.com.mjcxdev.introducaojava;
/* Regras e convenções de códigos
 * Classe Sempre Começa com letra maíusculas - OlaMundo - CamelCase
 * Variáveis sempre começa com letra minúsculas com a segunda paralavra CamelCase -idadeAlunoParaCadastro
 *
 *
 */
    //Comentário
/*
    Comentário
 */
/***
 * Comentário Oficial do Java para Documentação
 *
 */
// Variáveis
/*
    Em Java temos dois tipos de variáveis as de tipo primitivos e as do tipo references - Objetos

    Primitives Types
    1 int         5 char
    2 double      6 byte
    3 float       7 short
    4 boolean     8 long

 */
public class Aula_1_ImprimindoVariaveis {
    public static void main(String[] args) {
            // 1- Criando variáveis
            // = é usado para inicializar
        int idadeDoAlunoParaCadastro = 10;
                                                // Precisamos pelo menos de um método main
        System.out.println("Impressão de dados");
                                                    // Ponto de entrada

        System.out.println("A idade do Aluno é: " + idadeDoAlunoParaCadastro); // + é usado para contatenar
    }

}






