package com.vits56.maratonajava.javacore.Hheranca.test;

import com.vits56.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço na memória para o objeto da classe pai
    // 3 - Cada atributo de classe pai é criado e inicializado com seus valores default ou valores explicitos ou oque for passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço na memória para o objeto da classe filha
    // 7 - Cada atributo de classe filha é criado e inicializado com seus valores default ou valores explicitos ou oque for passado da classe filha
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria");
    }
}
