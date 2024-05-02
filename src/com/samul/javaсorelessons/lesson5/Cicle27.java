package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
самого числа. m и n вводятся с клавиатуры.
*/
public class Cicle27 {

	public static void main(String[] args) {
		int m, n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите числа m и n: ");
		
		while (!in.hasNextInt()) {
			System.out.println("Введите корректное число: ");
			in.next();
		}
		
		m = in.nextInt();

		while (!in.hasNextInt()) {
			System.out.println("Введите корректное число: ");
			in.next();
		}
		
		n = in.nextInt();
		
		for(int i = m; i <= n; i++) {
			System.out.print("\nДелители для " + i + ": ");
			for (int q = 2; q < i; q++) {
				if (i % q == 0) {
					System.out.print(q + " ");
				}
			}
		}
		
		
	}

}
