package com.samul.javaсorelessons.lesson5;

//10. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Cicle10 {

	public static void main(String[] args) {
		double prod = 1;
		
		for (int i = 1; i <= 200; i++) {
			prod *= Math.pow(i, 2);
		}
		
		System.out.println("Product = " + prod);

	}

}
