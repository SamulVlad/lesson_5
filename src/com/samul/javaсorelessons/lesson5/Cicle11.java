package com.samul.javaсorelessons.lesson5;

//11. Составить программу нахождения разности кубов первых двухсот чисел

public class Cicle11 {

	public static void main(String[] args) {
		long diff = 0;
		
		for (int i = 1; i <= 200; i++) {
			diff-= Math.pow(i, 3);
		}
		
		System.out.println("Difference = " + diff);

	}

}
