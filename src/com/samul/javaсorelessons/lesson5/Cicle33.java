package com.samul.javaсorelessons.lesson5;

//33. Найдите наибольшую цифру данного натурального числа.

public class Cicle33 {

	public static void main(String[] args) {
		int num = 12838752;
		int max = -1;
		
		while (num >= 1) {
			if (num % 10 >= max) {
				max = num % 10;
			}
			num /= 10;
		}
		
		System.out.println("Максимальная цифра = " + max);
	}

}
