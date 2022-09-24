package com.vits56.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Bruno Bastos";
        nome.concat(" Vits56");
        System.out.println(nome);

        System.out.println("------------------");

        StringBuilder sb = new StringBuilder("Bruno Bastos");
        sb.append(" Vits56");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 6);
        System.out.println(sb);
    }
}
