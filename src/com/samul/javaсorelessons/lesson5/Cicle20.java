package com.samul.javaсorelessons.lesson5;

/*20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. Общий член ряда имеет вид:
*/
public class Cicle20 {

	public static void main(String[] args) {
		double e = 0.005;
		double sum = 0;
		int n = 10;
		double an;

		for (int i = 1; i <= n; i++) {
			
			an = 1.0 / ((3 * i - 2) * (3 * i + 1));

			if (Math.abs(an) >= e) {
				sum += an;
			}
		}
		
		System.out.println(sum);

	}

}
