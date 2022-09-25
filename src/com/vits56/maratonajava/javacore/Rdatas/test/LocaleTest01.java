package com.vits56.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Locale localeItaly = new Locale("it", "IT");
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeIndia = new Locale("hi", "IN");

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);

        System.out.println("Italia " + df.format(calendar.getTime()));
        System.out.println("Brasil " + df2.format(calendar.getTime()));
        System.out.println("Japao " + df3.format(calendar.getTime()));
        System.out.println("India " + df4.format(calendar.getTime()));
    }
}
