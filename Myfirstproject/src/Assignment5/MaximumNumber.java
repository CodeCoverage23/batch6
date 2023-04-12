package Assignment5;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter num value:  ");
		int num=sc.nextInt();
		System.out.println("Enter num1 value: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2 value: ");
		int num2=sc.nextInt();
		
		 
		if((num > num1) && (num1 > num2)) {
			 
			 System.out.println("Maximum number is "+num);
		 }
		 else if(num>num2) {
			 System.out.println("maximum number is "+num1);
		 }
		 else {
			 System.out.println("maximum number is "+num2);
		 }
		 
		 }

	}


