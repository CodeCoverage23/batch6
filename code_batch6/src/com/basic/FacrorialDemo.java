package com.basic;

import java.util.Scanner;

public class FacrorialDemo {

		public static void main(String[] args) {
			Scanner ak= new Scanner (System.in);
			System.out.println("Enter the no");
			int no=ak.nextInt();
			
		        int i=1,a=1;
		        while(i<=no)
		        {
		        	 a=a*i;//facrorial number a*a
		             i++;
		        }
		// TODO Auto-generated method stub
System.out.println("Factorial of the number "+a);
	}

}
