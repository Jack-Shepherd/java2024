package com.up.java;

import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String fromUser = scanner.nextLine();
			int sum = 0;
			

	        for (char x : fromUser.toCharArray()) {
	            if (Character.isDigit(x)) {
	                sum += Character.getNumericValue(x);
	            }
	        }			
			
			System.out.println(sum);
		}		

	}

}
