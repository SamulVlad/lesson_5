package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

//12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую
//степень — отрицательные.

public class Condition12 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner in = new Scanner(System.in);
		
		if ((a = in.nextDouble()) >= 0) {
			a = Math.pow(a, 2);
		} else {
			a = Math.pow(a, 4);
		}

		if ((b = in.nextDouble()) >= 0) {
			b = Math.pow(b, 2);
		} else {
			b = Math.pow(b, 4);
		}

		if ((c = in.nextDouble()) >= 0) {
			c = Math.pow(c, 2);
		} else {
			c = Math.pow(c, 4);
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
