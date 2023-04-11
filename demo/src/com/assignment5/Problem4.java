//WAP to print month of year case1 January case2  use switch case 

package com.assignment5;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the  No: ");
		
		int A= sc.nextInt();
		
		switch(A) {
		
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("febrary");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("octobe");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
			
			default :
				System.out.println("wrong number");
		
		
		}
	}

}
