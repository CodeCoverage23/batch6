package com.demo;
import java.util.Scanner;

public class Ageprogram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age>0 && age<=5) {
			System.out.println("in child stage");
		}
		
		else if(age>=6 && age<=12) {
			System.out.println("childrens");
			
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teenagers and immature");
		
			
		}
		else if(age>=20 && age<=25) {
			System.out.println("those candidates are Adults and mature");
		}
		else if(age>26 && age<=35) {
			System.out.println("candidates are middel agers");
		}
		else if(age>=36 && age<=50) {
			System.out.println("candidates are in there working stage of life");
		}
		else if(age>51 && age<=80) {
			System.out.println("candidates are senior citizens");
		}
		
		else {
			System.out.println("invalid input");
		}
	}

}
