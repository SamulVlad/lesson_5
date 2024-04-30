package com.samul.javaсorelessons.lesson5;

//15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.

public class Cicle15 {

	public static void main(String[] args) {
		int res = 0;
		
		for (int i = 0; i <= 10; i++) {
			res += Math.pow(2, i);
		}
		
		System.out.println(res);

	}

}
