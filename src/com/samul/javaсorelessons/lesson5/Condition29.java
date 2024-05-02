package com.samul.javaсorelessons.lesson5;

//29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Condition29 {

	public static void main(String[] args) {
		int x1 = 0, y1 = 0, x2 = 5, y2 = 5, x3 = 10, y3 = 10;
		
		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки НЕ лежат на одной прямой");
		}
		
	}

}
