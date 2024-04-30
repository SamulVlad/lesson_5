package com.samul.javaсorelessons.lesson5;

//14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
//прямоугольным.

public class Condition14 {

	public static void main(String[] args) {
		int a = 45, b = 49;

		if (a + b < 180) {
			System.out.print("Такой треугольник существует и он ");

			if (a + b == 90) {
				System.out.print("прямоугольный");
			} else {
				System.out.print("не прямоугольный");
			}
		}

	}

}
