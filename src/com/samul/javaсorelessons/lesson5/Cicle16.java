package com.samul.javaсorelessons.lesson5;

//16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Cicle16 {

	public static void main(String[] args) {
		long prod = 1, sum = 0;
		

		for (int i = 1; i <= 10; i++) {
			sum += i;
			prod *= sum;
		}
		
		System.out.println(prod);

	}

}
