package Assignment_5;

import java.util.Scanner;

public class PositiveNegative {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is Positive");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative");
		}
	}

}
