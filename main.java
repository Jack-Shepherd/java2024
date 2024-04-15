package com.up.java;

public class main {
	
	public static void main(String [] args) {
		Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
		System.out.println(p1);
		Pozycja p2 = new Pozycja("Cukier", 3, 4);
		System.out.print(p2 + "\n");
		Zamowienie z = new Zamowienie(20);
		z.dodajPozycje(p1);
		z.dodajPozycje(p2);
		System.out.println(z);
	}
}

