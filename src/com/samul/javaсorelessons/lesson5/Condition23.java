package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены
некорректные данные, то сообщить об этом.
*/
public class Condition23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int day, month;
		
		System.out.print("Введите число и дату через пробел:");
		
		day = Integer.valueOf(in.next());
		month = Integer.valueOf(in.next());
		
		if ((day < 1 || day > 31) || (month < 1 || month > 12)) {
			System.out.println("Дата введена не корректно!");
		} else {
			System.out.println("Дата введена корректно.");
		}
		

	}

}
