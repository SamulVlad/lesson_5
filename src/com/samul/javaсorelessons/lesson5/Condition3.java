package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*
3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше
3; если больше, то вывести слово «no».
*/
public class Condition3 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if (a < 3) {
			System.out.println("YES");
		} else if (a > 3) {
			System.out.println("NO");
		}
	}


}
