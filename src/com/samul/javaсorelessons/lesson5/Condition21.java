package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В
зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
*/
public class Condition21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ans;
		
		System.out.print("Кто ты: мальчик или девочка?: ");
		
		ans = in.next().charAt(0);
		
		while (ans != 'д' && ans != 'м') {
			ans = in.next().charAt(0);
		}
		
		if (ans == 'д') {
			System.out.println("Мне нравятся девочки!");
		} else {
			System.out.println("Мне нравятся мальчики!");
		}
		
		
	}

}
