package com.samul.javaсorelessons.lesson5;

//10. Составить программу, которая определит площадь какого круга меньше.

public class Condition10 {

	public static void main(String[] args) {
		int r1 = 10, r2 = 12;
		double s1, s2;
		
		s1 = r1 * r1 * Math.PI;
		s2 = r2 * r2 * Math.PI; 		
		
		if (s1 < s2) {
			System.out.println("First");
		} else if (s1 > s2) {
			System.out.println("Second");
		} else {
			System.out.println("is eqal");
		}
	}

}
