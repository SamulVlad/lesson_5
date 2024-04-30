package com.samul.javaсorelessons.lesson5;

//7. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Cicle7 {

	public static void main(String[] args) {
		int a = -10, b = 10;
		int h = 2;

		while (a <= b) {
			if (a > 2) {
				System.out.println("y(" + a + ") = " + a);
			} else {
				System.out.println("y(" + a + ") = " + -a);
			}

			a += h;
		}

	}

}
