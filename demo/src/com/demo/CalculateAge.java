package com.demo;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
	
public static void main(String[] args) {
	LocalDate of = LocalDate.of(2000, 07,06);
	LocalDate now = LocalDate.now();
	Period age = Period.between(of, now);
	System.out.println(age);
	System.out.println(age.getYears()+" Years " + age.getMonths()+" Month " + age.getDays()+" Day ");
 }

}
