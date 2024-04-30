package com.samul.javaсorelessons.lesson5;

public class Condition16 {

	public static void main(String[] args) {
		int x = -1, y = 80;

		if ((x == 0) && (y == 0)) {
			System.out.println("Точка находится в начале координат");
		} else if (x == 0) {
			System.out.println("Точка находится на оси y");
		} else if (y == 0) {
			System.out.println("Точка находится на оси x");
		} else if ((x > 0) && (y > 0)) {
			System.out.println("Точка находится в первом квадранте");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Точка находится в втором квадранте");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("Точка находится в третьем квадранте");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("Точка находится в четвером квадранте");
		}

	}

}
