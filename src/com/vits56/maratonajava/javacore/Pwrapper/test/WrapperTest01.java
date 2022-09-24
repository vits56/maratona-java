package com.vits56.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'A';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;// autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'A';
        Boolean booleanW = true;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        System.out.println(intW2);
        System.out.println("------------------");
        boolean verdadeiro = Boolean.parseBoolean("TrUe");
        System.out.println(verdadeiro);
        System.out.println("------------------");
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
