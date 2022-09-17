package com.vits56.maratonajava.javacore.Bintroducaometodos.test;

import com.vits56.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Goku");
        funcionario01.setIdade(40);
        funcionario01.setSalarios(new double[3]);
        funcionario01.getSalarios()[0] = 1000;
        funcionario01.getSalarios()[1] = 2000;
        funcionario01.getSalarios()[2] = 3000;

        funcionario01.imprime();
    }
}
