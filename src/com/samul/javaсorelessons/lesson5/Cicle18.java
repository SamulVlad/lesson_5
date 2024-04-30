package com.samul.javaсorelessons.lesson5;

//18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид:


public class Cicle18 {

	public static void main(String[] args) {
		double e = 0.15;
		double sum = 0;
		int n = 10;
		double an;

		for (int i = 1; i <= n; i++) {
			an = Math.pow(-1, i - 1) / i;
			if (Math.abs(an) >= e) {
				sum += an;
			}
		}
		
		System.out.println(sum);

	}
}
