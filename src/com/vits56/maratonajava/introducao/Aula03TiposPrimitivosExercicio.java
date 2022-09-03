package com.vits56.maratonajava.introducao;
/*
* Prátiaca
*
* Crie variáveis para os campos descritos abaixo entre < > e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salário de <salário>, na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Bruno";
        String endereco = "Rua Evaristo 250";
        double salario = 4500.0D;
        String data = "10/01/2023";

        System.out.println("Eu " + nome + ", morando no endereço: " + endereco +
                ", confirmo que recebi o sálario de " + salario + " na data " + data);
    }
}
