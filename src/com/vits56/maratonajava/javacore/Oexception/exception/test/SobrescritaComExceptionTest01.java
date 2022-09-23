package com.vits56.maratonajava.javacore.Oexception.exception.test;

import com.vits56.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import com.vits56.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import com.vits56.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;


public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
