package com.samul.javaсorelessons.lesson5;

//8. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Cicle8 {

	public static void main(String[] args) {
		int a = -10, b = 25;
		int h = 1;
		int c = 10;
		int y;

		while (a <= b) {
			if (a != 15) {
				y = (a + c) * 2;
			} else {
				y = (a - c) + 2;
			}

			System.out.println("y(" + a + ") = " + y);

			a += h;
		}

	}

}
