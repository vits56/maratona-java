package com.vits56.maratonajava.javacore.Gassociacao.test;

import com.vits56.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.vits56.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
