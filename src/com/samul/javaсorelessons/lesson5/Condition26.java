package com.samul.javaсorelessons.lesson5;

//26. Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Condition26 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int sum = 0;
		
		if (a >= b && a >= c) {
			sum += a;
		} else if (b >= a && b >= c) {
			sum += b;
		} else if (c >= a && c >= b) {
			sum += c;
		}
		
		if (a <= b && a <= c) {
			sum += a;
		} else if (b <= a && b <= c) {
			sum += b;
		} else if (c <= a && c <= b) {
			sum += c;
		}
		
		System.out.println("Sum = " + sum);
		
	}

}
