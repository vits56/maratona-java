package com.vits56.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDisconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDisconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDisconto(double valor);
}