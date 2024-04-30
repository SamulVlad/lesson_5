package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

//18. Подсчитать количество отрицательных среди чисел а, b, с.

public class Condition18 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		int cnt = 0;

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		if (a < 0)
			cnt++;
		
		if (b < 0)
			cnt++;
		
		if (c < 0)
			cnt++;

		System.out.println("counter = " + cnt);
	}

}
