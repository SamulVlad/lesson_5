package com.samul.javaсorelessons.lesson5;

/*15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их
суммы, а большее — их удвоенным произведением.
*/
public class Condition15 {

	public static void main(String[] args) {
		double a = 4.5, b = 5.0;
		double min, max;

		min = (a + b) / 2;
		max = a * b * 2;
		
		if (a < b) {
			a = min;
			b = max;
		} else {
			a = max;
			b = min;
		}
		
		System.out.println(a);
		System.out.println(b);

	}

}
