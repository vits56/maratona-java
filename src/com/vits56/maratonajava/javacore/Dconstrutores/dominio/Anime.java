package com.vits56.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Genero: " + this.genero);
        System.out.println("Estudio: " + this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
