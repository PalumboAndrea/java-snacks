package org.lessons.java;

public class Snack3 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int sum = 0;
		
		for (int i = 1; i < numbers.length; i+=2) {
			int val = numbers[i];
			sum += val;
		}
		System.out.println(sum);
	}
}
