package com.up.java;

public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        return ileSztuk * cena;
    }

    @Override
    public String toString() {
        String formatowanaCena = String.format("%.2f zł", cena);
        String formatowanaWartosc = String.format("%.2f zł", obliczWartosc());
        return String.format("%-20s%-10s%.4sszt. %-10s", nazwaTowaru, formatowanaCena, ileSztuk, formatowanaWartosc);
    }
}
