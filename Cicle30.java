package com.samul.javaсorelessons.lesson5;

//30. Написать программу, переводящую римские цифры в арабские.

public class Cicle30 {

	public static void main(String[] args) {
		String numR = "MMXXIV";
		int nAr1 = 0, nAr0 = 0;
		int i;
		int numAr = 0;

		i = numR.length() - 1;

		nAr1 = switch(numR.charAt(i)) {
		case 'I' -> 1;
		case 'V' -> 5;
		case 'X' -> 10;
		case 'L' -> 50;
		case 'C' -> 100;
		case 'D' -> 500;
		case 'M' -> 1000;
		default -> 0;
		};
		
		numAr = nAr1;
		
		while (i > 0) {
			
			nAr0 = switch(numR.charAt(i - 1)) {
			case 'I' -> 1;
			case 'V' -> 5;
			case 'X' -> 10;
			case 'L' -> 50;
			case 'C' -> 100;
			case 'D' -> 500;
			case 'M' -> 1000;
			default -> 0;
			};
			
			if (nAr0 < nAr1) {
				numAr -= nAr0;
			} else {
				numAr += nAr0;
			}
			
			nAr1 = nAr0;
			
			i--;

		}
		
		System.out.println(numR + " = " + numAr);
	}

}
