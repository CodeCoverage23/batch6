package com.demo;

import java.util.Scanner;

public class ReturnTypeDemo {

	public int factorial() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Factorial Value");
		int n = scan.nextInt();

		int i;
		int fact = 1;

		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
//		System.out.println(fact);
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  className   anyName =  new Constructor(which is exactly equals to clss name	
		ReturnTypeDemo obj	= new ReturnTypeDemo();
    // name.methodname
	int a=obj.factorial();
	//iska sop print krne ke liye upr vale ko variable assign krna pdega fir vo variable sop me dal sakte
	// bcz upr vala jo fact hai vo sirf method tak hi limited hai , main me nahi aayega
	
	//ye sab process tab follow krna hai jb apn void nhi dege, bcz void is non-return type.
	//agr void dete hai to usi method me sop print kr skte hai jese return ke upr comment kiya hai.
		
		System.out.println(a);
	}

	
}
