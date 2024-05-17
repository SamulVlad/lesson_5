package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
*/
public class Condition34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int price, moneySumm;
		
		System.out.print("Enter the ammount price: ");
		price = in.nextInt();
		System.out.print("Enter the ammount of money: ");
		moneySumm = in.nextInt();
		
		if (price == moneySumm) {
			System.out.println("Thank you");
		} else if (price < moneySumm) {
			System.out.println("Take the change: " + (moneySumm - price));
		} else if (price > moneySumm) {
			System.out.println("That is not enought: " + (price - moneySumm));
		}

	}

}
