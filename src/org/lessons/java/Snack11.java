package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scrivi un numero:");
		int userNumber = sc.nextInt();
		
		sc.close();
		
		for (int i = 1; i <= userNumber; i++) {
			if (userNumber % i == 0) {
				System.out.println(i);
			}
		}
	}
}
