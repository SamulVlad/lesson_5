package com.samul.javaсorelessons.lesson5;

/*38. Для заданного натурального числа определить, образуют ли его цифры арифметическую
прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
*/
public class Cicle38 {

	public static void main(String[] args) {
		int num = 13579;
		int dgt0, dgt1;
		int h;
		boolean result = true;

		dgt0 = num % 10;
		num /= 10;
		dgt1 = num % 10;
		num /= 10;
		h = dgt1 - dgt0;
		
		while (num >= 1) {
			dgt0 = dgt1;
			dgt1 = num % 10;
			
			if ((dgt1 - dgt0) != h) {
				result = false;
				break;
			}

			num /= 10;
		}
		
		if (result == false) {
			System.out.println("Это не арифметическая прогрессия!");
		} else {
			System.out.println("Это арифметическая прогрессия!");

		}

	}

}
