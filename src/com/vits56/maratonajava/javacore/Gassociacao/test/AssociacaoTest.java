package com.vits56.maratonajava.javacore.Gassociacao.test;

import com.vits56.maratonajava.javacore.Gassociacao.dominio.Aluno;
import com.vits56.maratonajava.javacore.Gassociacao.dominio.Local;
import com.vits56.maratonajava.javacore.Gassociacao.dominio.Professor;
import com.vits56.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua 1");
        Aluno aluno = new Aluno("Joao", "20");
        Professor professor = new Professor("Joao", "Java");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como ser um programador Java", alunosParaSeminario, local);

        Seminario[] seminariosDispobiveis = {seminario};

        professor.setSeminarios(seminariosDispobiveis);

        professor.imprime();
    }
}
