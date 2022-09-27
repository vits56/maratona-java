package com.vits56.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1989, 8, 25, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        long days = ChronoUnit.DAYS.between(aniversario, now);
        long weeks = ChronoUnit.WEEKS.between(aniversario, now);
        long months = ChronoUnit.MONTHS.between(aniversario, now);
        long years = ChronoUnit.YEARS.between(aniversario, now);

        System.out.println(days);
        System.out.println(weeks);
        System.out.println(months);
        System.out.println(years);
    }
}
