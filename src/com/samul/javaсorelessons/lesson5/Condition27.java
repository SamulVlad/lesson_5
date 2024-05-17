package com.samul.javaсorelessons.lesson5;

//27. Найти max{min(a, b), min(c, d)}.

public class Condition27 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40;
		int min1, min2;
		
		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		
		if (c < d) {
			min2 = c;
		} else {
			min2  = d;
		}
		
		if (min1 > min2) {
			System.out.println("1. Max = " + min1);
		} else {
			System.out.println("1. Max = " + min2);
		}
		
		// Еще можно решить через тернарный оператор.
		
		int result = (a < b ? a : b) > (c < d ? c : d) ? (a < b ? a : b) : (c < d ? c : d);
		System.out.println("2. Max = " + result);
		

	}

}
