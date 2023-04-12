package com.assignment5;

import java.util.*;

public class Greterthan_100 {
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		if(number>100) {
			System.out.println("number is greter than 100");
		}
		else if(number >=100) {
			System.out.println("number is 100");
		}
		else {
			System.out.println("number is less than 100");
		}
		}
	}

