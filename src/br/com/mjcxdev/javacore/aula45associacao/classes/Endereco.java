package br.com.mjcxdev.javacore.aula45associacao.classes;

public class Endereco {
    // 7- Agora imagine que queremos aproveitar a classe endereço em outros sistemas
    // Esse relacionamento forte com a classe pessoa vai impossibilitar de usarmos essa classe em outro sistema
    // Pois se formos utilizar em outro sistema teremos que levar a classe pessoa também então temos um problema

    private String rua;
    private String bairro;
    private String estado;

    //6- E na classe endereço relacionamento com pessoas fica assim

    // 8 - Por isso existe o termo navegabilidade, nesse caso eu quero que pessoas tenha endereço mas não quero que endereço
    // tenha pessoas, ai para solucionar temos que ter um relacionamento unidirecional
    // Então removemos a classe pessoa de endereço
    // private Pessoa [] pessoa;


}
