package com.vits56.maratonajava.javacore.Npolimorfismo.servico;

import com.vits56.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando dados na memoria");
    }

}
