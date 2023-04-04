package com.demo;
import java.util.Scanner;

public class PrimeNum {
	
	public static void main(String[]args) {
		
		int num,count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		
			System.out.println("The number is Prime Number");
			else
				System.out.println("The number is not Prime Number");
		
	}

}
