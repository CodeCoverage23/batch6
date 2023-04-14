//8. Write a program to swap the two numbers.

package com.assignment_5;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int a = 30, b = 40;
         System.out.println("Before swapping, a="+a+"b="+ b);
         a = a+b;
         b = a-b; //b=30
         a = a-b;
         System.out.println("After Swapping, a="+a+"b="+ b);
	}
}


