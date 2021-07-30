/*
* Alta coesão é uma classe realizar algo bem específico - bom - loja de chocolate
* Baixa coesão é uma classe ter varias coisas nela   - ruim - supermercado */

package br.com.mjcxdev.javacore.aula24introducaopacotes.teste;

import br.com.mjcxdev.javacore.aula24introducaopacotes.classes.Aula_25_ExercicioProfessor;

public class Aula25ExercicioProfessorTeste {
    public static void main(String[] args) {

        Aula_25_ExercicioProfessor prof = new Aula_25_ExercicioProfessor();

        prof.nome = "Joaquim Nabuco";
        prof.matricula = "AS12345";
        prof.rg = "3928286421";
        prof.cpf = "064.554.616-06";
        System.out.println("O Professor "+ prof.nome+" de matricula "+prof.matricula +
                " RG numero "+ prof.rg + " e CPF "+ prof.cpf + " é fera!");
        System.out.println("----------------------------------------------------------");

        //Se quiser criar outro professor(objeto):
        Aula_25_ExercicioProfessor prof2 = new Aula_25_ExercicioProfessor();

        prof2.nome = "Jubileu";
        prof2.matricula = "AS1DS349";
        prof2.rg = "3951456666";
        prof2.cpf = "055.065.456-06";

        System.out.println("O Professor "+ prof2.nome+" de matricula "+prof2.matricula +
                " RG numero "+ prof2.rg + " e CPF "+ prof2.cpf + " é fera!");

        //Temos aqui duas variáveis de referência: prof e prof2 e dois objetos

        // se eu fizer:
           // prof = prof2;
        // O garbadi colector do java vai sobrescrever prof com prof2



    }
}
