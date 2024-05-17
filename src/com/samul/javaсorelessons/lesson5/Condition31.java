package com.samul.javaсorelessons.lesson5;

/*31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
*/
public class Condition31 {

	public static void main(String[] args) {
		int a = 2;
		int b = 30;

		int x = 10;
		int y = 1;
		int z = 3;
		
		boolean result;

		if (x < a && y < b) {
			result = true;
		} else if (x < a && z < b) {
			result = true;
		} else if (y < a && z < b) {
			result = true;
		} else {
			result = false;
		}

		System.out.println(result);
		
		// Или все можно решить одним логическим выражением
		result = (x < a && y < b) || (x < a && z < b) || (y < a && z < b);
		System.out.print(result);
		

		// TODO Auto-generated method stub

	}

}
