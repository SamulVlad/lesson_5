package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

//17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
//из исходных, а если равны, то заменить числа нулями.

public class Condition17 {

	public static void main(String[] args) {
		int n, m;
		Scanner in = new Scanner(System.in);
		int max;
		
		n = in.nextInt();
		m = in.nextInt();
		
		if (n > m) {
			max = n;
		} else {
			max = m;
		}
		
		if (n == m) {
			n = m = 0;
		} else {
			n = m = max;
		}
		
		System.out.println("n = " + n);
		System.out.println("m = " + m);

	}

}
