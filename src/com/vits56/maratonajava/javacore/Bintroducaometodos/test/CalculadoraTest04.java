package com.vits56.maratonajava.javacore.Bintroducaometodos.test;

import com.vits56.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Fora do altera dois números");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }
}
