package com.Assignment5;

import java.util.Scanner;

public class NumberGreaterthan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		if(num>100) {
			System.out.println("The num is greater than 100");
		}
		else {
		if(num==100) {
			System.out.println("The num is equal to 100");
		}
	    else {
	    	System.out.println("the num is less than 100");
		}
		}
		}
		
	}


