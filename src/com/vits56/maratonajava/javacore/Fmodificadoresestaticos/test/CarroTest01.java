package com.vits56.maratonajava.javacore.Fmodificadoresestaticos.test;

import com.vits56.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        Carro.setVelocidadeLimite(180);

        c1.imprime();

        c2.imprime();
        c3.imprime();
    }
}
