package com.vits56.maratonajava.javacore.Bintroducaometodos.test;

import com.vits56.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.vits56.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Jiraya";
        estudante01.idade = 60;
        estudante01.sexo = 'M';

        estudante02.nome = "Kakashi";
        estudante02.idade = 30;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);

        System.out.printf("--------------------%n");

        impressora.imprime(estudante02);
    }
}
