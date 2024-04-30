package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

//20. Определить, делителем каких чисел а, b, с является число k.

public class Condition20 {

	public static void main(String[] args) {
		int a, b, c;
		int k = 3;
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if (a % k == 0) {
			System.out.println("К является делителем для a");
		}
		
		if (b % k == 0) {
			System.out.println("К является делителем для b");
		}
		
		if (c % k == 0) {
			System.out.println("К является делителем для c");
		}
		
	}

}
