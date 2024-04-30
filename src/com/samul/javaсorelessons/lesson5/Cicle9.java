package com.samul.javaсorelessons.lesson5;

//9. Найти сумму квадратов первых ста чисел.

public class Cicle9 {

	public static void main(String[] args) {
		long sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += Math.pow(i, 2);
		}

		System.out.println("sum = " + sum);

	}

}
