package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Scrivi un numero:");
		int userNumber = sc.nextInt();
		
		System.out.println(
				userNumber % 2 == 0
				? userNumber
				: userNumber + 1
				);
	}
}
