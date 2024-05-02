package com.samul.javaсorelessons.lesson5;

import java.util.Random;
import java.util.Scanner;

/*31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя.
*/
public class Cicle31 {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		int num;

		for (int i = 1; i <= 5; i++) {
			num = rnd.nextInt(15);
			System.out.print("\nВведите целое число в диапазоне от 1 до 15: ");
			if (num == in.nextInt()) {
				System.out.println("Вы угадали!");
			} else {
				System.out.println("Не угадали! Число было " + num);
			}
		}

	}

}
