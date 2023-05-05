package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Scrivi una parola:");
		String userInput = sc.nextLine();
		char[] charArray = userInput.toCharArray();
		Boolean palindroma = true;
			
		for (int i = 0; i<charArray.length; i++) {
			if (charArray[i] != charArray[charArray.length -1 - i]) {
				palindroma = false;
			}
		}
		
		System.out.println(palindroma ? "E' palindroma" : "Non è palindroma");
	}
}
