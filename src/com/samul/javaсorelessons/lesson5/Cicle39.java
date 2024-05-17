package com.samul.javaсorelessons.lesson5;

/*39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
получили исходное число. Найти это число.
*/
public class Cicle39 {

	public static void main(String[] args) {

		for (int num = 100; num <= 999; num++) {
			int newNum = num % 100;
			if (num == newNum * 7) {
				System.out.println(num);
				break;
			}
		}

	}

}
