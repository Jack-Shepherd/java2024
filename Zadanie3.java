package com.up.java;

import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String fromUser = scanner.nextLine().toLowerCase();
			StringBuilder sB = new StringBuilder(fromUser);
			String s = sB.toString();
			
			boolean czyPalindrom;
			
			
			
			if (s.equals(sB.reverse().toString())) {				
				czyPalindrom = true;
			}
			else {
				czyPalindrom = false;
			}
			
			System.out.println("Palindrom?: " + czyPalindrom);
		}		

	}

}
