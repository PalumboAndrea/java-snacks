package org.lessons.java;

import java.util.Random;
import java.util.Arrays;

public class Snack8 {
	public static void main(String[] args) {

		Random rnd = new Random();
		
		Integer[] even = new Integer[10]; // pari
		Integer[] odd = new Integer[10]; // dispari
		
		int evenIndex = 0;
		int oddIndex = 0;
		
		for (int i = 0; i < 10; i++) {
			int randomNumber = rnd.nextInt(100);
			if (randomNumber % 2 == 0) {
				even[evenIndex] = randomNumber;
				evenIndex++;
			} else {
				odd[oddIndex] = randomNumber;
				oddIndex++;
			}
		}
		
		System.out.println(Arrays.asList(even));
		System.out.println(Arrays.asList(odd));
	}
}
