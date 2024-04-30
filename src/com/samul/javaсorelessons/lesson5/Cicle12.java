package com.samul.javaсorelessons.lesson5;

/*12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
нахождения произведения первых 10 членов этой последовательности.
*/
public class Cicle12 {

	public static void main(String[] args) {
		long prod = 1;
		int an = 0, an_temp;

		for (int n = 1; n <= 10; n++) {
			if (n == 1) {
				an = 1;
			} else {
				an_temp = an;
				an = 6 + an_temp;
			}

			prod *= an;

		}

		System.out.println("prod = " + prod);

	}

}
