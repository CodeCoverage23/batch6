package com.poojahande.Assignment;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Entered number is even ");
		}else
		{
			System.out.println("Entered number is odd");
		}
	}
}
