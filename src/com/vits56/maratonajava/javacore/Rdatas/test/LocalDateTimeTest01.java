package com.vits56.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 25);
        LocalTime time = LocalTime.of(15, 30, 45);

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
