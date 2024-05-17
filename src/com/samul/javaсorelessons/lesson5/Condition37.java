package com.samul.javaсorelessons.lesson5;

//37. Вычислить значение функции:

public class Condition37 {

	public static void main(String[] args) {
		double x = 4;
		double fx;

		if (x >= 3) {
			fx = -x * x + 3 * x + 9;
		} else {
			if ((Math.pow(x, 3) - 6) == 0) {
				System.out.println("выражение не может быть вычислено, т.к. в знаменатель равен 0!");
				return;
			} else {
				fx = 1 / (Math.pow(x, 3) - 6);
			}
		}

		System.out.println("F(x)=" + fx);

	}

}
