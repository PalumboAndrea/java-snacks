package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Scrivi una parola:");
		String userInput = sc.nextLine();
		char[] charArray = userInput.toCharArray();
			
		for (int i = 0; i<charArray.length/2; i++) {
			if (charArray[i] != charArray[charArray.length -1 - i]) {
				System.out.println("Non è palindroma");
				return;
			}
		}
		
		System.out.println("E' palindroma");
	}
}
