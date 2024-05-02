package com.samul.javaсorelessons.lesson5;

import java.util.Scanner;

/*28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.
*/
public class Cicle28 {

	public static void main(String[] args) {
		int x, y;
		char oper;
		double res = 0;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("\nВведите выражение для вычисления (с пробелами в формате a + b): ");

			
			if ((x = in.nextInt()) == 0) {
				System.out.println("See you next time!");
				continue;
			};
			
			oper = in.next().charAt(0);
			y = in.nextInt();

			if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
				System.out.println("Задана не корректная операция! \'" + oper + "\'");
				continue;
			}

			switch (oper) {
			case '+':
				res = x + y;
				break;
			case '-':
				res = x - y;
				break;
			case '*':
				res = x * y;
				break;
			case '/':
				if (y == 0) {
					System.out.println("Деление на 0!");
					continue;
				}
				res = (double) x / y;
			}

			System.out.println(x + " " + oper + " " + y + " = " + res);
		} while (x != 0);

	}

}
