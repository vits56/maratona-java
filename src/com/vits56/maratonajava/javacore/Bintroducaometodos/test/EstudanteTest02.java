package com.vits56.maratonajava.javacore.Bintroducaometodos.test;

import com.vits56.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gogeta";
        estudante01.idade = 60;
        estudante01.sexo = 'M';

        estudante02.nome = "Kakashi";
        estudante02.idade = 30;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
