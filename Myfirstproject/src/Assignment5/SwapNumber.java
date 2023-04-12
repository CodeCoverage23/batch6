package Assignment5;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		int n,n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		n = sc.nextInt();
		System.out.println("Enter second number: ");
		n1 = sc.nextInt();
		
	    int num=n;
		n=n1;
		n1=num;
		
		System.out.println("After swapping number is  n = " + n + " n1 = " + n1);
		
		
	}

}
