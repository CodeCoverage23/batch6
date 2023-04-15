package com.demo;

import java.util.Scanner;

public class If_Else_Ladder {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter Your Name here");
		String name =scan.next();
//		int age = 5;
		
		System.out.println("Enter Your Age here");
		int age = scan.nextInt();
		
		if (age<5) {
			System.out.println("You are a kidd. ");
		}else if(age>=5 && age<=15) {
			System.out.println("According to your age You are in School");
		}else if(age>=16 && age<=18){
			System.out.println("According to your age you are in Junior College");
		}else if(age>=19 && age<=22){
			System.out.println("According to your age you are in graduation");
		}else if(age>23 && age<=50) {
			System.out.println("Now You are ready for Job");
		}else {
			System.out.println("Invalid age.");
		}
		
	}

}
