package com.up.java;

import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String fromUser = scanner.nextLine();
			StringBuilder sB = new StringBuilder(fromUser);			
			
			System.out.println(sB.reverse());
		}		

	}

}
