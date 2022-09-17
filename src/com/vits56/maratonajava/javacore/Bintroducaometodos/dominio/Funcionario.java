package com.vits56.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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

        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("Média salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
