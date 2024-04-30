package com.samul.javaсorelessons.lesson5;

//8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.

public class Condition8 {

	public static void main(String[] args) {
		int a = 5, b = -4;
		
		if (a * a < b * b) {
			System.out.println("a");
		} else if (a * a > b * b) {
			System.out.println("b");
		} else {
			System.out.println("is eqal");
		}

	}

}
