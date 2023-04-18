//WAP TO FIND OUT MAXIMUM NUMBER AMONG THREE NUMBER

package com.Assignment_5;

import java.util.Scanner;

public class MaximumNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=sc.nextInt();
		b= sc.nextInt();
		c = sc.nextInt();

		if(a>=b && a>=c)
		{
			System.out.println("The maximum number is:" +a);
		}
		else if(b>=a && b>=c)
			{
				System.out.println("The maximum number is:" +b);
			}
		else
		{
			System.out.println("The maximum number is:" +c);
		}
	
	
	}

}