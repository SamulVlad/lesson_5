package com.samul.javaсorelessons.lesson5;

//6. Составить программу: определения наибольшего из двух чисел а и b.

import java.util.Scanner;

public class Condition6 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		if (a > b) {
			System.out.println("max is a");
		} else if (b > a) {
			System.out.println("max is b");
		} else {
			System.out.println("is eqal");
		}
	}

}
