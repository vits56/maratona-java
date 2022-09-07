package com.vits56.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // 0 - 34.712 9.70%
        // 34.713 - 68.507 37.35
        // 68.508 >      49.50%

        double bruto = 100000;
        double tax1 = 9.7 / 100;
        double tax2 = 37.35 / 100;
        double tax3 = 49.50 / 100;
        double valorImposto;

        if (bruto <= 34712) {
           valorImposto = tax1;
        } else if (bruto >= 34713 && bruto <= 68507) {
            valorImposto = tax2;
        } else {
            valorImposto = tax3;
        }

        System.out.println("Você terá que pagar de imposto: " + bruto * valorImposto +", E seu salário depois do desconto ficou em " + (bruto - (bruto * valorImposto)));

    }
}
