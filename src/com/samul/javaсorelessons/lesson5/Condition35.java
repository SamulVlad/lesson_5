package com.samul.javaсorelessons.lesson5;

//35. Вычислить число и месяц в невисокосном году по номеру дня.

public class Condition35 {

	public static void main(String[] args) {
		int day = 225;
		String month = "";
		int dayOfMonth = 0;
		
		if (day <= 31) {
			month = "Январь";
			dayOfMonth = day;
		} else if ((day >= 32) && (day <= 59)) {
			month = "Февраль";
			dayOfMonth = day - 32;
		} else if ((day >= 60) && (day <= 90)) {
			month = "Март";
			dayOfMonth = day - 60;
		} else if ((day >= 91) && (day <= 120)) {
			month = "Апрель";
			dayOfMonth = day - 91;
		} else if ((day >= 121) && (day <= 151)) {
			month = "Май";
			dayOfMonth = day - 121;
		} else if ((day >= 152) && (day <= 181)) {
			month = "Июнь";
			dayOfMonth = day - 152;
		} else if ((day >= 182) && (day <= 212)) {
			month = "Июль";
			dayOfMonth = day - 182;
		} else if ((day >= 213) && (day <= 243)) {
			month = "Август";
			dayOfMonth = day - 213;
		} else if ((day >= 244) && (day <= 273)) {
			month = "Сентябрь";
			dayOfMonth = day - 244;
		} else if ((day >= 274) && (day <= 304)) {
			month = "Октябрь";
			dayOfMonth = day - 274;
		} else if ((day >= 305) && (day <= 334)) {
			month = "Ноябрь";
			dayOfMonth = day - 305;
		} else if ((day >= 335) && (day <= 365)) {
			month = "Декабрь";
			dayOfMonth = day - 335;
		};
		
		System.out.println("Month: " + month + ", day: " + dayOfMonth);

	}

}
