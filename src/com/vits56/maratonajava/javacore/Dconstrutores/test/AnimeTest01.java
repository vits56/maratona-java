package com.vits56.maratonajava.javacore.Dconstrutores.test;

import com.vits56.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 25, "Shounen");
        Anime anime2 = new Anime("Naruto", "TV", 220, "Shounen");
        anime.imprime();
        anime2.imprime();
    }
}
