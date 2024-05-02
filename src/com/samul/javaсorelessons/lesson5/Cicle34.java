package com.samul.javaсorelessons.lesson5;

//34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Cicle34 {

	public static void main(String[] args) {

		for (int i = 1000; i <= 9999; i++) {
			
			int num = i;
			int sum = 0;
			
			while (num >= 1) {
				sum += num % 10;
				num /= 10;
			}
			
			if (sum == 15) {
				System.out.println("Сумма цифр числа " + i + " равна 15.");
			}
		}
		
	}

}
