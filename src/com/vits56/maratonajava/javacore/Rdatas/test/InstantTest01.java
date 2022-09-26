package com.vits56.maratonajava.javacore.Rdatas.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // nanosegundos
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000)); // 1970-01-01T00:00:03Z + 1s
    }
}
