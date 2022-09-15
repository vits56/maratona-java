package com.vits56.maratonajava.javacore.Aintroducaoclasses.test;

import com.vits56.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro = carro2;

        carro.nome = "Ferrari";
        carro.modelo = "F40";
        carro.ano = 1992;

        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2003;

        carro3.nome = "Fiat";
        carro3.modelo = "Uno";
        carro3.ano = 1998;

        System.out.println("Nome: " + carro.nome + ", modelo: " + carro.modelo + ", ano: " + carro.ano);
        System.out.println("Nome: " + carro2.nome + ", modelo: " + carro2.modelo + ", ano: " + carro2.ano);
        System.out.println("Nome: " + carro3.nome + ", modelo: " + carro3.modelo + ", ano: " + carro3.ano);

    }
}
