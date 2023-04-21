package com.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateExample {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate of = LocalDate.of(2022, 03, 05);
		System.out.println(of);
		
		int dayOfMonth = now.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.println(dayOfWeek);
		
		int dayOfYear = now.getDayOfYear();
		System.out.println(dayOfYear);
		
		int year = now.getYear();
		System.out.println(year);
		
		int year1 = of.getYear();
		System.out.println(year1);

		LocalDateTime atTime = now.atTime(4, 21,20 );
		System.out.println(atTime);
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);
		
		LocalDate plusDays = now.plusDays(3);
		System.out.println(plusDays);
		
		LocalDate minusDays = now.minusDays(2);
		System.out.println(minusDays);
		
	}
}
