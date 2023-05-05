package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ditiga la misura per la base:");
		int base = sc.nextInt();
		
		System.out.println("Ditiga la misura per l'altezza:");
		int height = sc.nextInt();
		
		sc.close();
		
		int area = base * height;
		int perimeter = 2 * base + 2 * height;
		
		System.out.println("L'area è: " + area);
		System.out.println("Il perimetro è: " + perimeter);
	}
}
