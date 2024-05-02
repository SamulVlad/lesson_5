package com.samul.javaсorelessons.lesson5;

//22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

public class Condition22 {

	public static void main(String[] args) {
		int x = 10, y = 13;
		int min;
		
		if (x < y) {
			min = x;
			x = y;
			y = min;
		}
		
		System.out.println("x = " + x + ", y = " + y);
	}
	

}
