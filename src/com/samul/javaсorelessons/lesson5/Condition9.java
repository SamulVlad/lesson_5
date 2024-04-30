package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
равносторонним.
*/
public class Condition9 {

	public static void main(String[] args) {
		int a, b ,c;
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if (a == b && b == c) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равностронний");
		}
		

	}

}
