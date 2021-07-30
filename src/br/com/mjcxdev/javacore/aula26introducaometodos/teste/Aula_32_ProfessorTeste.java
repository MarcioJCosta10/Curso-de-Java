

package br.com.mjcxdev.javacore.aula26introducaometodos.teste;

import br.com.mjcxdev.javacore.aula26introducaometodos.classes.Aula_32_Professor;

public class Aula_32_ProfessorTeste {

    public static void main(String[] args) {
        Aula_32_Professor prof = new Aula_32_Professor();
        prof.cpf = "115.564.065-00";
        prof.matricula = "145454";
        prof.rg = "5456464";
        prof.nome = "Marcos";

        prof.imprime(); // Aqui o imprime está usando o this para pegar os valores dentro do próprio obejto

        Aula_32_Professor prof2 = new Aula_32_Professor();
        prof2.cpf = "555.666.777-00";
        prof2.matricula = "255684";
        prof2.rg = "5568856";
        prof2.nome = "Joana";

        prof2.imprime(); // Aqui o imprime está usando o this para pegar os valores dentro do próprio obejto

        // o metodo imprime() será executado dentro do objeto
        // Exite algum jeito do método dentro do objeto já utilizar os atributos desse objeto
        // Para atingir isso temos que usar a palavra this

       // prof.imprime(); // Quando usamos o this voce está dizendo para esse objeto Aula_32_Professor
                        // executar o imprime() e dentro do imprime temos o this
                        // Quando usamos o this estamos falando para o imprime() pegue os valores
                        // this.nome this.rg this.cpf e this.matricula de dentro do objeto
                        // Por isso não preciso passar mais nenhum tipo de variável de referencia

        // Agora para imprimir o professor 2 eu preciso falar para imprimir do outro objeto
        // Então tenho que trabalhar com a variável de referência que conhece esse objeto
        // Que é prof2
       // prof2.imprime();
    }
}
