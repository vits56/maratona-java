package com.vits56.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Gohan";

    }
}
