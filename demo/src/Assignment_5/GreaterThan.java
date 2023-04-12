package Assignment_5;

import java.util.Scanner;

public class GreaterThan {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		if(num>100) {
			System.out.println("Greater than 100");
		}
		else
		{
			System.out.println("Not greater than 100");
		}
	}

}
