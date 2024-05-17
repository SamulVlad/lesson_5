package com.samul.javaсorelessons.lesson5;

//29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Cicle29 {

	public static void main(String[] args) {
		int a = 1011359431, b = 134984343;
		int dgtA, dgtB;
		boolean d0 = false, d1 = false, d2 = false, d3 = false, d4 = false, d5 = false, d6 = false, d7 = false,
				d8 = false, d9 = false;

		while (a >= 1) {
			dgtA = a % 10;
			int num = b;
			while (num >= 1) {
				
				dgtB = num % 10;
				
				// надо делать конечно же через массив буллеанов, но темы массивы еще не было. Поэтому нельзя. Вот и выкручиваюсь.
				
				if (dgtA == dgtB) {
					switch (dgtA) {
					case 0:
						if (!d0) {
							System.out.print(dgtA + " ");
							d0 = true;
						}
						break;
					case 1:
						if (!d1) {
							System.out.print(dgtA + " ");
							d1 = true;
						}
						break;
					case 2:
						if (!d2) {
							System.out.print(dgtA + " ");
							d2 = true;
						}
						break;
					case 3:
						if (!d3) {
							System.out.print(dgtA + " ");
							d3 = true;
						}
						break;
					case 4:
						if (!d4) {
							System.out.print(dgtA + " ");
							d4 = true;
						}
						break;
					case 5:
						if (!d5) {
							System.out.print(dgtA + " ");
							d5 = true;
						}
						break;
					case 6:
						if (!d6) {
							System.out.print(dgtA + " ");
							d6 = true;
						}
						break;
					case 7:
						if (!d7) {
							System.out.print(dgtA + " ");
							d7 = true;
						}
						break;
					case 8:
						if (!d8) {
							System.out.print(dgtA + " ");
							d8 = true;
						}
						break;
					case 9:
						if (!d9) {
							System.out.print(dgtA + " ");
							d9 = true;
						}
					}

					break;
				}

				num /= 10;
			}

			a /= 10;
		}

	}

}
