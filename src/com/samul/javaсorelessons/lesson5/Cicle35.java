package com.samul.javaсorelessons.lesson5;

//35. Найдите количество четных цифр данного натурального числа.

public class Cicle35 {

	public static void main(String[] args) {
		int num = 12838752;
		int dgt;
		int cnt = 0;

		while (num >= 1) {
			dgt = num % 10;
			if (dgt % 2 == 0) {
				cnt++;
			}
			num /= 10;
		}

		System.out.println("Сумма четных цифр = " + cnt);
	}

}
