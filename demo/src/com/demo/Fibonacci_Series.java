//Fibonacci Series

package com.demo;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,no,a = 0 ,b=1,c;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of Series");
     no = sc.nextInt();
     a=0;
     b=1;
     System.out.println("Fibonacci Series is");
     for(i=0;i<no;i++)
     {
    	 System.out.println(a);
    	 c = a + b;
    	 a = b;
    	 b = c;
     }
	}

}
