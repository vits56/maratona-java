package com.vits56.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Bruno"; // String constant pool
        String nome2 = "Bruno";
        nome = nome.concat(" Bastos"); // nome += " Bastos";
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Bruno"); // 1 variável de referência e 2 objeto do tipo String, 3 String no heap
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // nome2 está sendo comparado com o valor de dentro do pool de String

    }
}
