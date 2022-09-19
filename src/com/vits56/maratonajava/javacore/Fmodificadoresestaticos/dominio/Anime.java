package com.vits56.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe (é executado apenas 1 vez)
    // 1 - Alocado espaço na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado
    static  {
        System.out.println("Dentro do bloco de inicialização1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static  {
        System.out.println("Dentro do bloco de inicialização2");
    }

    static  {
        System.out.println("Dentro do bloco de inicialização3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {


        for (int episodio : Anime.episodios) {
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
