package com.samul.javaсorelessons.lesson5;

/*24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
числом.
*/
public class Cicle24 {

	public static void main(String[] args) {
		int num = 1234567891;
		int dgt = 0;
		int trans = 0;
		
		while (num >= 1) {
			dgt  = num % 10;
			trans = trans * 10 + dgt;
			num /= 10;
		}
		
		System.out.println("New number = " + trans);

	}

}
