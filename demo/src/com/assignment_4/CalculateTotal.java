
//Write the Java Program to calculate total of five subject marks and average of it.

package com.assignment_4;

public class CalculateTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sci= 60;
		int math=67;
		int phy=68;
		int bio=56;
		int eng=78;
		
		int sum =sci + math + phy + bio + eng;
		System.out.println("Sum of all subject is:  "+sum );
		int average = sum/5;
		System.out.println("Average marks are :  " +average );
	}	
}
