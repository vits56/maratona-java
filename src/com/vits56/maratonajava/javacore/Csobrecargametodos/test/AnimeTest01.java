package com.vits56.maratonajava.javacore.Csobrecargametodos.test;

import com.vits56.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Seriado", 500, "Aventura");
        anime.imprime();
    }
}
