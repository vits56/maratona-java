package com.vits56.maratonajava.javacore.Oexception.exception.test;

import com.vits56.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Digite o username");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Digite a senha");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Logado com sucesso");
    }
}
