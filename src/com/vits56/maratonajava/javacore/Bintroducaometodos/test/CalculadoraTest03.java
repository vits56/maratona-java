package com.vits56.maratonajava.javacore.Bintroducaometodos.test;

import com.vits56.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(2, 20);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        calculadora.imprimeDivisaoDeDoisNumeros(20, 100);

    }
}
