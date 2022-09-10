package com.vits56.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 1000000
        int contador = 0;
        while (contador <= 1000000) {
            System.out.println(contador);
            contador += 2;
        }
        System.out.println("Fim do while");

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
