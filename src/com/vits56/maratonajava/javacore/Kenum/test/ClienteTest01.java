package com.vits56.maratonajava.javacore.Kenum.test;

import com.vits56.maratonajava.javacore.Kenum.dominio.Cliente;
import com.vits56.maratonajava.javacore.Kenum.dominio.TipoCliente;
import com.vits56.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDisconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDisconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoclientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);


    }
}
