package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

//25. Требуется определить факториал числа, которое ввел пользователь.

public class Cicle25 {

	public static void main(String[] args) {
		int num;
		long fak = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите целое число >> ");
		
		while (!in.hasNextInt()) {
			System.out.println("Введите целое число! ");
			in.next();
		}
		
		num = in.nextInt();
		
		for (int i = 1; i <= num; i++) {
			fak *= i;
		}
		
		System.out.println("Факториал = "  + fak);
		

	}

}
