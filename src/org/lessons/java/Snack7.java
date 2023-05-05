package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {

		Random rnd = new Random();
		
		int rndNumber = 1;
		
		while (rndNumber % 15 != 0) {
			rndNumber = rnd.nextInt(100);
			System.out.println(rndNumber);
		}
	}
}
