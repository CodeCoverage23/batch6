package com.demo;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate of = LocalDate.of(1995, 02, 01);	
		LocalDate now = LocalDate.now();
		Period age = Period.between(of, now);
       System.out.println("years : "+age.getYears()+" month : "+age.getMonths()+" Days : "+age.getDays());
	//System.out.println(age);
	}

}
