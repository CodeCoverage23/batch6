package com.basic;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args)
	{
		int rev=0, n, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbe to check");
		n= sc.nextInt();
		x=n;
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
			
		}
		if(rev==x)
		{
			System.out.println("Number is palindrom");
		}
		else {
			System.out.println("number is not palindrom");
		}

	}

}
