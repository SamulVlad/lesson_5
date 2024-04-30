package com.samul.javaсorelessons.lesson5;

/*4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
включительно.
*/
public class Cicle4 {

	public static void main(String[] args) {
		int i = 2;

		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
