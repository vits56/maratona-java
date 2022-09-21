package com.vits56.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física" ),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoclientePorNomeRelatorio(String nome) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.nomeRelatorio.equals(nome)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
