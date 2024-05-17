package com.samul.javaсorelessons.lesson5;

//40. Вычислить значение функции:

public class Condition40 {

	public static void main(String[] args) {
		double x = 4;
		double fx;

		if (x <= 13) {
			fx = -Math.pow(x, 3) + 9;
		} else {
			fx = 3 / (x + 1);
		}

		System.out.println("F(x)=" + fx);

	}

}
