package com.vits56.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 1000000000000000000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 20;
        short idadeShort = 21;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; // 2 bytes

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
    }
}
