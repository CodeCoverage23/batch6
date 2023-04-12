package Assignment_5;

import java.util.Scanner;

public class EvenOdd {
	
	public EvenOdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
		
	}
	public static void main(String[] args) {
		EvenOdd eo=new EvenOdd();
	}

}
