package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в
базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют
следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 —
доступен модуль базы С.
*/
public class Condition33 {

	public static void main(String[] args) {
		int password = -1;
		Scanner in = new Scanner(System.in);
		
		while (password != 0) {
			
			System.out.print("Enter password: ");
			password = in.nextInt();
			
			switch (password) {
			case 9583:
			case 1747:
				System.out.println("Доступны модули баз А, В, С");
				break;
			case 3331:
			case 7922:
				System.out.println("Доступны модули баз В, С");
				break;
			case 9455:
			case 8997:
				System.out.println("Доступень модуль С");
				break;
			case 0:
				System.out.println("Завершение работы");
				break;
			default:	
				System.out.println("Доступ закрыт");
			}
		}

	}

}
