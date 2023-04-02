package com.demo ;

 import java.util.Scanner;

public class FactorialForLoop {
    public static void main (String []args) {
    	int n;
		int fact=1;
		System.out.println("Enter the number ");
		Scanner sc=new Scanner (System.in);
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			{
			fact=fact*i;
			}
			System.out.println(" factorial is " +fact);
		}
    }
}

