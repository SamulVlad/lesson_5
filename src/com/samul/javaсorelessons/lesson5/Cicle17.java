package com.samul.javaсorelessons.lesson5;

//17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Cicle17 {

	public static void main(String[] args) {
		int n = 5;
		double a = 10.5;
		double res = 1;
		
		for (int i = 0; i <= n - 1; i++) {
			res *= a + i;
		}
	
		System.out.println(res);
	}

}
