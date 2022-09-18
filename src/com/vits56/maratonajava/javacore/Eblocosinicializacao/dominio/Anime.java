package com.vits56.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado
    {
        episodios = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {


        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
