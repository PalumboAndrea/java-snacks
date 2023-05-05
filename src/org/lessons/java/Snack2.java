package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		Random rnd = new Random();

		String[] invitedListName = {"giorgio", "giovanni", "andrea", "stefano", "alessandro"};
		String[] invitedListSurname = {"mastrota", "giti", "palumbo", "magni", "zoia"};
		
		for (int i = 0; i < invitedListName.length; i++) {
			String invitedNameAndSurname = 
					invitedListName[rnd.nextInt(invitedListName.length)]
					+ " "
					+ invitedListSurname[rnd.nextInt(invitedListSurname.length)];
			System.out.println(invitedNameAndSurname);
		}
	}
}
