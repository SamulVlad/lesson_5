package com.samul.javaсorelessons.lesson5;

/*40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои
цифры.*/

public class Cicle40 {

	public static void main(String[] args) {
		int num =  100;
		
		for (int i = 1; i <= num; i++) {
			
			int tempNum = i;
			
			while (tempNum > 0) {
				int dgt = tempNum % 10;
				
				if (dgt == 0) {
					tempNum /= 10;
					continue;
				}
				
				if (i % dgt != 0) {
					break;
				}
				
				tempNum /= 10;
			}
			
			if(tempNum == 0) {
				System.out.println(i);
			}
		}
	}

}
