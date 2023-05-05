package org.lessons.java;

import java.util.Scanner;
import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		Integer[] arr3 = new Integer[arr1.length + arr2.length];
		int x = arr1.length;
		
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[x] = arr2[i];
			x++;
		}

		System.out.println(Arrays.asList(arr3));
	}
}
