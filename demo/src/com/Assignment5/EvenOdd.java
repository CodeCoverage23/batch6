package com.Assignment5;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if( i%2==0) {
			System.out.println("The given no is even");
			
		}else {
			System.out.println("The given no is odd");
		}
		

	}

}
