package com.vits56.maratonajava.javacore.Hheranca.test;

import com.vits56.maratonajava.javacore.Hheranca.dominio.Endereco;
import com.vits56.maratonajava.javacore.Hheranca.dominio.Funcionario;
import com.vits56.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("00000-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("000.000.000-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("---------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setCpf("111.111.111-11");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();

    }
}
