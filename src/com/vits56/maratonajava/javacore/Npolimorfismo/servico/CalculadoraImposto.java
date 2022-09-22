package com.vits56.maratonajava.javacore.Npolimorfismo.servico;

import com.vits56.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.vits56.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Computador computador) {
        System.out.println("Relatório de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

}
