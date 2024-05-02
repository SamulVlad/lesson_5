package com.samul.javaсorelessons.lesson5;

/*32. Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
буквами, цифрами и знаком подчеркивания.
*/
public class Cicle32 {

	public static void main(String[] args) {
		String str = "1BBBbjk28F9  *5gs1_01-212";

		if (!(str.charAt(0) >= 'a' && str.charAt(0) <= 'z') && !(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
				&& str.charAt(0) != '_') {
			System.out.println("В первой позиции НЕДОПУСТИМЫЙ символ \'" + str.charAt(0) + "\'");
		} else {
			System.out.println("В первой позиции допустимый символ");
		}

		for (int i = 1; i <= str.length() - 1; i++) {
			if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && !(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
					&& !(str.charAt(i) >= '0' && str.charAt(i) <= '9') && str.charAt(i) != '_') {
				System.out.println("В позиции " + i + " НЕДОПУСТИМЫЙ символ \'" + str.charAt(i) + "\'");
			}

		}
	}

}
