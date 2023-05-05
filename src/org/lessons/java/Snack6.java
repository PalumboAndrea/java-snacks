package org.lessons.java;

import java.util.Scanner;
import java.util.Random;

public class Snack6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("Scrivi un numero:");
		int userInput = sc.nextInt();
		
		int sum = 0;
		
		while (sum < userInput) {
			int random = rnd.nextInt(100);
			sum += random;
			if (sum > userInput) {
				sum = sum - random;
				break;
			}
		}
		System.out.println(sum);
	}
}
