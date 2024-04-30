package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
суммирует все числа от 1 до введенного пользователем числа.
*/
public class Cicle6 {

	public static void main(String[] args) {
		int a;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		 
		a = in.nextInt();
		
		for	(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}

}
