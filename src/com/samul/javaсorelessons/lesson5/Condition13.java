package com.samul.javaсorelessons.lesson5;

/*13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к
началу координат.
*/
public class Condition13 {

	public static void main(String[] args) {
		int x1 = 5, y1 = 10, x2 = 10, y2 = 6;
		double d1, d2;
		
		d1 = Math.sqrt(x1 * x1 + y1 * y1);
		d2 = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (d1 < d2) {
			System.out.println("Первая точка ближе");
		} else if (d1 > d2) {
			System.out.println("Вторая точка ближе");
		} else {
			System.out.println("Растояние одинаковое");
		}
			
	}

}
