package com.vits56.maratonajava.javacore.Npolimorfismo.test;

import com.vits56.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.vits56.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.vits56.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import com.vits56.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
