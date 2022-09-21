package com.vits56.maratonajava.javacore.Jmodificadorfinal.test;

import com.vits56.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import com.vits56.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import com.vits56.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("João");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
