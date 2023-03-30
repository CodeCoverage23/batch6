package com.java;

import java.io.StringWriter;
import java.util.Scanner;

public class If_ladderAGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object system;
		Scanner gkp = new Scanner(System.in);
		
		System.out.println("rollnumber:");
		 int rollnumber = gkp.nextInt();
		
		   System.out.println("age");
		   int age=gkp.nextInt();
		
		if (age>=60 && age<=90) {
			System.out.println("senior Adult");
		}
		
		else if (age>=40 && age<60) {
			System.out.println("middle age Adult");
		}
		
		else if (age>=20 && age<40) {
			System.out.println("Adult");
		}
		else if (age>=13 && age<20) {
			System.out.println("Teen");
		}
		else if(age>=5 && age<13) {
			System.out.println("Child");
		}
		else if(age>=2 && age<5) {
			System.out.println("Toddler");	}
		
		else if (age>=0 && age<2) {
			System.out.println("Infant");
		}
	}
	

}