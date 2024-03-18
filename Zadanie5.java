package com.up.java;

import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String fromUser = scanner.nextLine();
			int nawiasy = 0;
			

	        for (char x : fromUser.toCharArray()) {
	            if (x == '(') nawiasy++;
	            if (x == ')') nawiasy--;
	        }
	        
	        if (nawiasy == 0) System.out.println("OK");
	        else System.out.println("Błędne sparowanie nawiasów");      	
			
		}		

	}

}
