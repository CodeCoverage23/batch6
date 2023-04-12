package com.assignment5;
import java.util.Scanner;
public class SwapingNumber {
	public static void main(String[]args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		//c=sc.nextInt();
		
		c=a;
		a=b;
		b=c;
		System.out.println("The swapping of Number a= "+a  + " b=" +b);
	}

}
