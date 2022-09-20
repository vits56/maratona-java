package com.vits56.maratonajava.javacore.Gassociacao.test;

import com.vits56.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.vits56.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador, jogador2};
        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Jogador---");

        jogador.imprime();

        System.out.println("---Time---");

        time.imprime();


    }
}
