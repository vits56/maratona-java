package com.vits56.maratonajava.javacore.Aintroducaoclasses.test;

import com.vits56.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "João";
        estudante.idade = 25;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("---------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);


    }
}
