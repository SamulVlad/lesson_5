package com.samul.javaсorelessons.lesson5;

/*32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
положительной.
*/
public class Condition32 {

	public static void main(String[] args) {
		int a = -10, b = -11, c = 5;
		
		if ((a + b > 0) || (a + c > 0) || (b + c > 0)) {
			System.out.println("Сумма каких-либо двух из заданных чисел является положительной");
		} else {
			System.out.println("Сумма каких-либо двух из заданных чисел НЕ является положительной");
		}

	}

}
