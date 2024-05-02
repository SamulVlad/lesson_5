package com.samul.javaсorelessons.lesson5;

/*23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции:
*/
public class Cicle23 {

	public static void main(String[] args) {
		double a = 0.5, b = 15, h = 0.2;
		double fx;
		
		if (a > b) {
			System.out.println("Не верно задан отрезок!");
			return;
		}

		if (b - a < h) {
			System.out.println("Шаг не может быть больше отрезка!");
			return;
		}

		System.out.printf("---------------------------------\n");
		System.out.printf("|\tx\t|\tf(x)\t|\n");
		System.out.printf("---------------------------------\n");

		while (a <= b) {
			fx = 1 / Math.tan(a / 3) + 0.5 * Math.sin(a);

			System.out.printf("|\t%.2f\t|\t%.2f\t|\n", a, fx);
			a += h;
		}

		System.out.printf("---------------------------------\n");


	}

}
