package com.vits56.maratonajava.javacore.Gassociacao.test;

import com.vits56.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.vits56.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola de Java", professores);
        escola.imprime();
    }
}
