package com.samul.javaсorelessons.lesson5;

/*28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —
c).
*/
public class Condition28 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 20;
		int max;

		if (a == d) {
			System.out.println("a = d");
		} else if (a == b) {
			System.out.println("b = d");
		} else if (a == b) {
			System.out.println("c = d");
		} else {
			max = d - a;
			if (d - b > max) {
				max = d - b;
			}

			if (d - c > max) {
				max = d - c;
			}

			System.out.println("Max = " + max);

		}

	}

}
