package com.basic;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age :");
		int age = sc.nextInt();

		if(age>=18) {
			System.out.println("valid For Vote");
		}else if(age<=12) {
			System.out.println("Valid For Pandcard:");
			}else {
				System.out.println("Invalid Input");
			}






		}
	

	}
