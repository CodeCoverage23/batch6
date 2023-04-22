package com.demo;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class AgeCalculater{
	public static void main(String []args) {
		
		System.out.println("enter your birth year");
		Scanner sc=new Scanner (System.in);
		int Year=sc.nextInt();
		System.out.println("enter your birth month");
		int Month=sc.nextInt();
		System.out.println("enter you birth date ");
		int Day=sc.nextInt();
		
		LocalDate of=LocalDate.of(Year, Month, Day);
		LocalDate now=LocalDate.now();
		Period age=Period.between(of,now);
		System.out.println("Years:"+age.getYears()+"month:"+age.getMonths()+"Days:" +age.getDays()); 
				
		
	
	}
	
		

	
	
}

