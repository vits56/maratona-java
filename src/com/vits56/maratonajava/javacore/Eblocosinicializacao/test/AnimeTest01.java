package com.vits56.maratonajava.javacore.Eblocosinicializacao.test;


import com.vits56.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.printf("%d ", episodio);
        }

    }
}
