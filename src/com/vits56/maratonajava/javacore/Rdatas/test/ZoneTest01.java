package com.vits56.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokioZOne = ZoneId.of("Asia/Tokyo");
        System.out.println(tokioZOne);
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        ZonedDateTime zonedDateTime = agora.atZone(tokioZOne);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokioZOne);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(agora, offset);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(agora, ZoneOffset.ofHours(-3));
        System.out.println(offsetDateTime1);
    }
}
