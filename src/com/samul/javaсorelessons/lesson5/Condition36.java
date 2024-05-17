package com.samul.javaсorelessons.lesson5;

//36. Вычислить значение функции:

public class Condition36 {

	public static void main(String[] args) {
		double x = 4;
		double fx;

		if (x <= 3) {
			fx = x * x - 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("F(x)=" + fx);

	}

}
