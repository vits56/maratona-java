package com.vits56.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission on file");
    }
}

