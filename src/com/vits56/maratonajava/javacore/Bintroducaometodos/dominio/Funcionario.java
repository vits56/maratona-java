package com.vits56.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios == null) {
            return;
        }
        imprimeSalariosComMedia();
    }

    public void imprimeSalariosComMedia() {
        if (this.salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("Média salarial: " + media);
    }
}
