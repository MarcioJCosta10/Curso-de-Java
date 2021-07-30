

package br.com.mjcxdev.javacore.aula45associacao.classes;

public class Departamento {
    // O DIAGRAMA DE CLASSE EM JAVA É FICA DESSA MANEIRA //
    // 2- Quando dizemos que uma classe departamento tem várias pessoas, sempre será algum tipo de array ou lista

    private Pessoa[] pessoas; // Atributo que cabe vários objetos

    // 3 - Tem uma questão de navegabilidade, é algo onde nem sempre teremos um relacionamento bidirecional igual
    // A esse exemplo Departamento e pessoa onde um departamento tem 0 ou mais pessoas e pessoas tem um departamento
    // Mas nem sempre será bidirecional:
    // Digamos que temos uma classe chamada endereço, pessoa tem relacionamento com endereço e o endereço tem uma ou várias pessas
    //


}
