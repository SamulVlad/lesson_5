package com.samul.javaсorelessons.lesson5;

/*26. Вывести на экран соответствий между символами и их численными обозначениями в памяти
компьютера (Таблицу ASCII).
*/
public class Cicle26 {

	public static void main(String[] args) {

		for (char c = 0; c <= 256; c++) {
			System.out.println((int) c + " = " + c);
		}

	}

}
