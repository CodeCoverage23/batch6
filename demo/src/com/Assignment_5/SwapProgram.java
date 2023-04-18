//WAPto swap the two numbers

package com.Assignment_5;

import java.util.Scanner;

public class SwapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		//c=sc.nextInt();

		c=a;
		a=b;
		b=c;
		{
		System.out.println("The swapping of Number a= "+a  + " b=" +b);
	}
	}

}
