package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//java program for localdate 
public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate of = LocalDate.of(2023, 4, 20);
		System.out.println(of);
		int dayOfMonth = now.getDayOfMonth();
	System.out.println(dayOfMonth);
	int year = now.getYear();
	System.out.println(year);
	LocalDateTime atTime = now.atTime(2, 23, 59);
	System.out.println(atTime);
	LocalTime now2 = LocalTime.now();
	System.out.println(now2);
	LocalDate plusDays = now.plusDays(1);
	System.out.println(plusDays);
	LocalDate minusDays = now.minusDays(2);
	System.out.println(minusDays);
	}
	

}
