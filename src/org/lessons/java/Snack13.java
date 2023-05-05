package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Snack13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] arr1Copy = new Integer[arr1.length];
		Integer[] arr2Copy = new Integer[arr2.length];
		
		for (int i=0; i<arr1.length; i++) {
			if (i==0) {
				arr1Copy[i] = arr2[i];
			} else {
				arr1Copy[i] = arr1[i];
			}
		}
		
		for (int i=0; i<arr2.length; i++) {
			if (i==0) {
				arr2Copy[i] = arr1[i];
			} else {
				arr2Copy[i] = arr2[i];
			}
		}
		
		System.out.println(Arrays.asList(arr1Copy));
		System.out.println(Arrays.asList(arr2Copy));
		
	}
}
