//WAP to check the number is positive or negative

package com.assignment5;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc =new Scanner (System.in);
			
			System.out.println("Enter the number");
			
			int a= sc.nextInt();
			
			if(a<=0) {
			
		  System.out.println("This number is negative");
			}
			else {
				System.out.println("This number is Positive");
			}
			}
		


	

}
