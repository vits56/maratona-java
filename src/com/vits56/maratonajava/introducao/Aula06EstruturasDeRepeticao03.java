package com.vits56.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor. por exemplo 50

        int valor = 50;
        for (int i = 0; i < valor; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}

