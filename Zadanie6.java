package com.up.java;

import java.util.Scanner;

public class Zadanie6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Tekst do zakodowania:");
			String fromUser = scanner.nextLine();
			
			System.out.println("Przesunięcie:");
			int przesuniecie = Integer.parseInt(scanner.nextLine());
			
			String alfabet = "abcdefghijklmnopqrstuvxyz";
			
			String zakodowany = "";
			
	        for (char x : fromUser.toCharArray()) {
	           int miejsce = alfabet.indexOf(x);	           
	           zakodowany += alfabet.charAt((miejsce+przesuniecie)%26);
	        }
	        
			System.out.println("zakodowany: ");
			System.out.println(zakodowany);


	             	
			
		}		

	}

}
