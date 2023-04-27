package com.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number  ");
		int num = sc.nextInt();
		for(int i=1; i<=num;i++) {
			
			if(num%i==0)
			counter++;
		}
		if(counter==2) {
			System.out.println(" number is prime");}
			else {
				System.out.println(" number is not prime");
			}
		}
	}


