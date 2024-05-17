package com.samul.javaсorelessons.lesson5;

//38. Вычислить значение функции:

public class Condition38 {

	public static void main(String[] args) {
		double x = 4;
		double fx;

		if (x <= 3 && x >= 0) {
			fx = x * x;
		} else {
			fx = 4;
		}

		System.out.println("F(x)=" + fx);

	}

}
