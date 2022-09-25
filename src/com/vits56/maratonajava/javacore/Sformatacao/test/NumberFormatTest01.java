package com.vits56.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePtBr = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localePtBr);
        nfa[3] = NumberFormat.getInstance(localeItaly);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
