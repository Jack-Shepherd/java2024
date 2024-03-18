package com.up.java;

import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String fromUser = scanner.nextLine();
			char lastLetter = fromUser.charAt(fromUser.length()-1);
			int timesOccured = 0;
			
			for(char x : fromUser.toCharArray()) {
				if(x==lastLetter) timesOccured++;
			}
			
			
			System.out.println(timesOccured);
		}		

	}

}
