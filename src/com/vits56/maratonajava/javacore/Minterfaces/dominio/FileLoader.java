package com.vits56.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data from file");
    }
}

