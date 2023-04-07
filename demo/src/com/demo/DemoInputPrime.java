package com.demo;

import java.util.Scanner;

public class DemoInputPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ip = new Scanner(System.in);
       
       System.out.println(" Enter your number ");
       int i = ip.nextInt();
           if (i % 2==0 && i % 1 == 0) {
        	   
        	   System.out.println(" is a prime ");
           }
           else
           {
        	   System.out.println(" is a not prime ");
           }
	}
}

