package com.vits56.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[0][2] = 29;

        dias[1][0] = 31;
        dias[1][1] = 30;
        dias[1][2] = 31;

        dias[2][0] = 30;
        dias[2][1] = 31;
        dias[2][2] = 29;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----------");

        for (int[] ref : dias) {
            for (int dia : ref) {
                System.out.println(dia);
            }
        }

    }
}
