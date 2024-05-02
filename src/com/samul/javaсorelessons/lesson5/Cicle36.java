package com.samul.javaсorelessons.lesson5;

/*36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
делится на их произведение. Найти эти числа.
*/
public class Cicle36 {

	public static void main(String[] args) {
		
		for(int a = 10; a <= 99; a++) {
			
			for(int b = 10; b <= 99; b++) {
				int num = 100 * a + b;
				if ((num % (a * b)) == 0) {
					System.out.println("Это число: " + num);
				}
			}
			
		}
		
	}

}
