package com.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int i,J,Fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Integer Number To Calculate His Factorial:");
         J=sc.nextInt();
        for( i=1;i<=J;i++)
        {
            Fact=i*Fact;	
        }
        System.out.println("Factorial Of "+J+" is "+Fact);
	}

}
