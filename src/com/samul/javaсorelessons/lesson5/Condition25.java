package com.samul.javaсorelessons.lesson5;

import java.util.Random;

/*25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
«Пожароопасная ситуация », если температура в комнате превысила 60° С.
*/
public class Condition25 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int temp;
		
		for (int i = 1; i <= 100; i++) {
			temp = rnd.nextInt(100);
			
			if (temp >= 60) {
				System.out.println("!!!!!!! Пожар !!!!!!! t = " + temp);
			} else {
				System.out.println("t = " + temp);
			}
		}
	}

}
