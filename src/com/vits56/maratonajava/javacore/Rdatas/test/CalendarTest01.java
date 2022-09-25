package com.vits56.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Hora: " + c.get(Calendar.HOUR));
        System.out.println("Minuto: " + c.get(Calendar.MINUTE));
        System.out.println("Segundo: " + c.get(Calendar.SECOND));
        System.out.println("Milissegundo: " + c.get(Calendar.MILLISECOND));
        System.out.println("AM ou PM: " + c.get(Calendar.AM_PM));
        System.out.println("Semana do mês: " + c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana do ano: " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Dia da semana no mês: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Zona horária: " + c.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
        System.out.println("Horário de verão: " + c.get(Calendar.DST_OFFSET) / (60 * 60 * 1000));
        System.out.println("Data completa: " + c.getTime());
        Date date = c.getTime();
        System.out.println(date);
    }
}
