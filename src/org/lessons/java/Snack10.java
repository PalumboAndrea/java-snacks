package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scrivi la misura del raggio:");
		int radius = sc.nextInt();
		
		sc.close();
		
		double area = radius * radius * Math.PI;
		double perimeter = 2 * radius * Math.PI;
		
		System.out.println("L'area è: " + String.format("%.2f", area));
		System.out.println("Il perimetro è: " + String.format("%.2f", perimeter));
	}
}