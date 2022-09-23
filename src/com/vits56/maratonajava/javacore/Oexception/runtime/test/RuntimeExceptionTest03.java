package com.vits56.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println("-----");
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }
}
