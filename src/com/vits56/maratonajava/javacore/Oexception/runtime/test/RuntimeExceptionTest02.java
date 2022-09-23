package com.vits56.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(10, 0);
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException
     */

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de zero para b");
        }
        return a / b;
    }
}
