package com.vits56.maratonajava.javacore.Npolimorfismo.test;

import com.vits56.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.vits56.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.vits56.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Notebook", 2000);
        Tomate tomate = new Tomate("Tomate", 10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
