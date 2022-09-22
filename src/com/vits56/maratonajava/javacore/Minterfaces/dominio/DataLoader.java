package com.vits56.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();

    default void checkPermission() {
        System.out.println("Checking permission");
    }
}
