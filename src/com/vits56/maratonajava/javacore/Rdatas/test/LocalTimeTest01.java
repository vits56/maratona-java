package com.vits56.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15, 30, 45);
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        System.out.println(time);
        System.out.println(agora.getHour());
        System.out.println(agora.getMinute());
        System.out.println(agora.getSecond());
        System.out.println(agora.get(ChronoField.HOUR_OF_DAY));
        System.out.println(agora.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(agora.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);

    }
}
