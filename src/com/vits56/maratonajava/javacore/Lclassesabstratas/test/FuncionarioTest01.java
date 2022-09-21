package com.vits56.maratonajava.javacore.Lclassesabstratas.test;

import com.vits56.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.vits56.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

    }
}
