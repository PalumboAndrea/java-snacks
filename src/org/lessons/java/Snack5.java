package org.lessons.java;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Snack5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("Scrivi un numero:");
		int userNumber = sc.nextInt();
		int[] numberArray = new int[userNumber];
		
		for (int i = 0; i < userNumber; i++) {
			numberArray[i] = rnd.nextInt(100);
			System.out.println(numberArray[i]);
		};
		
		int sum = 0;
		int sumEven = 0;
		double average = 0;
		double averageOdd = 0;
		int min = 0;
		int max = 0;
		int oddNumber = 0;
	
		for (int i = 0; i < numberArray.length; i++) {
			sum += numberArray[i];
			
			if(numberArray[i] % 2 == 0) {
				sumEven += numberArray[i];
			}
			
			if(i == numberArray.length - 1) {
				average = sum/numberArray.length;
			} else {
				average += numberArray[i];
			}
			
			if(i == numberArray.length - 1) {
				averageOdd = averageOdd/oddNumber;
			} else if (numberArray[i] % 2 != 0){
				averageOdd += numberArray[i];
				oddNumber++;
			}
				
			min = Arrays.stream(numberArray).min().getAsInt();
	        max = Arrays.stream(numberArray).max().getAsInt();
		};
		
		System.out.println("La somma è: " + sum);
		System.out.println("La somma dei valori pari è: " + sumEven);
		System.out.println("La media è: " + average);
		System.out.println("La media dei valori dispari è: " + averageOdd);
		System.out.println("Il valore minimo è: " + min);
		System.out.println("Il valore massimo è: " + max);
		
	}
}
