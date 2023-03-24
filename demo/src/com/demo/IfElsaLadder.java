package com.demo;

import java.util.Scanner;

public class IfElsaLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Your T-Shirt Size : ");
		int age= sc.nextInt();
		
		if (age >= 0 && age <= 15 )
		{ 
			System.out.println(" Your T-Shirt Price Is 100 ");
		}
		else if (age > 15 && age <= 20 ) {
			System.out.println(" Your T-Shirt Price Is 200 ");
			
		} else if (age > 20 && age <= 25 )
		{
			System.out.println(" Your T-Shirt Price Is 300 ");
		}
		else if (age > 25 && age <= 35 )
		{
			System.out.println(" Your T-Shirt Price Is 400 ");
		}
		else if (age > 35 && age <= 45 )
		{
			System.out.println(" Your T-Shirt Price Is 500");
		}
		else 
		{
			System.out.println(" Your T-Shirt Price Is 600");
		}
	}
}
