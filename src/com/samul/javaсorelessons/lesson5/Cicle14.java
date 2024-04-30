package com.samul.javaсorelessons.lesson5;

//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Cicle14 {

	public static void main(String[] args) {
		double res = 0;
		int n = 10;
		
		for (int i = 1; i <= n; i++) {
			res += 1.0/i;
		}
		
		System.out.println(res);

	}

}
