package com.vits56.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public void imprime() {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
