package com.vits56.maratonajava.javacore.Minterfaces.dominio;

import com.vits56.maratonajava.javacore.Minterfaces.dominio.DataLoader;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }
}

