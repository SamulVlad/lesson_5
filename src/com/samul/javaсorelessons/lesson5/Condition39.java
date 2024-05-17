package com.samul.javaсorelessons.lesson5;

//39. Вычислить значение функции:

public class Condition39 {

	public static void main(String[] args) {
		double x = 4;
		double fx;

		if (x >= 8) {
			fx = -x * x + x - 9;
		} else {
			if ((Math.pow(x, 4) - 6) == 0) {
				System.out.println("выражение не может быть вычислено, т.к. в знаменатель равен 0!");
				return;
			} else {
				fx = 1 / (Math.pow(x, 4) - 6);
			}
		}

		System.out.println("F(x)=" + fx);

	}

}
