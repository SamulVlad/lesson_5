package com.samul.javaсorelessons.lesson5;

/*30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если
это не так.
*/
public class Condition30 {

	public static void main(String[] args) {
		int a = 10, b = -20, c = 30;
		
		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

}
