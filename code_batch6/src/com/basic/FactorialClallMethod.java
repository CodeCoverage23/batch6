package com.basic;

import java.util.Scanner;

public class FactorialClallMethod {

		
		public static void main(String[] args) {
			int n;
			int fact=1;
			System.out.println("Enter the number ");
			Scanner ak=new Scanner (System.in);
			int no=ak.nextInt();
			for(int i=1;i<=no;i++) {
				{
				fact=fact*i;
				}
				System.out.println(" factorial is" +fact);
			}
			
		//public long factorial (fact=fact*i;)
			//fact=fact*i;
			//return  ;
	}

}
