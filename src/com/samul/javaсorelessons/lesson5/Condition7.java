package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

//7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

public class Condition7 {

	public static void main(String[] args) {
		int a, b, c, x;
		int res;
		Scanner in = new Scanner(System.in);
		
		System.out.print("a=");
		a = in.nextInt();
		System.out.print("b=");
		b = in.nextInt();
		System.out.print("c=");
		c = in.nextInt();
		System.out.print("x=");
		x = in.nextInt();
		
		res = Math.abs(a * x * x + b * x + c);
		
		System.out.println("res = " + res);
		
	}

}
