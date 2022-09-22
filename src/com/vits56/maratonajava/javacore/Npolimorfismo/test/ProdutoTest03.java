package com.vits56.maratonajava.javacore.Npolimorfismo.test;

import com.vits56.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.vits56.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.vits56.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.vits56.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 7000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("10/10/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
