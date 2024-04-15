package com.up.java;

import java.util.Arrays;

public class Zamowienie {
	
	private Pozycja[] pozycje;
    private int ileDodanych;
    private int maksRozmiar;

    public Zamowienie() {
        this.maksRozmiar = 10;
        this.pozycje = new Pozycja[maksRozmiar];
        this.ileDodanych = 0;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        this.pozycje = new Pozycja[maksRozmiar];
        this.ileDodanych = 0;
    }

    public void dodajPozycje(Pozycja pozycja) {
        if (ileDodanych < maksRozmiar) {
            pozycje[ileDodanych] = pozycja;
            ileDodanych++;
        } else {
            System.out.println("Nie można dodać więcej pozycji. Osiągnięto maksymalny rozmiar zamówienia.");
        }
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (int i = 0; i < ileDodanych; i++) {
            wartoscZamowienia += pozycje[i].obliczWartosc();
        }
        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zamówienie: \n");
        for (int i = 0; i < ileDodanych; i++) {
            sb.append(pozycje[i].toString()).append("\n");
        }
        sb.append(String.format("%-36s%-5.2f zł", "Łączna wartość zamówienia:", obliczWartosc()));
        return sb.toString();
    }

}
