package com.basic;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Birthdate : ");
		int Day = sc.nextInt();
		System.out.println("Enter Your Birthmonth : ");
		int Month = sc.nextInt();
		System.out.println("Enter Your Birthyear");
		int Year = sc.nextInt();
		
		LocalDate birthday = LocalDate.of(Year, Month, Day);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		System.out.println("Years : "+p.getYears()+ " Month : "+p.getMonths() +" Days : "+p.getDays());
		
	}

}
