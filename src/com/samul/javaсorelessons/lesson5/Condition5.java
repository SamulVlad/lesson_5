package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

//5. Составить программу: определения наименьшего из двух чисел а и b.

public class Condition5 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		if (a < b) {
			System.out.println("min is a");
		} else if (b < a) {
			System.out.println("min is b");
		} else {
			System.out.println("is eqal");
		}
	}
}
