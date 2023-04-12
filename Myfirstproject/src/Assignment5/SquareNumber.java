package Assignment5;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n= sc.nextInt();
		int sq;
		
		sq = n*n;
		
		System.out.println("The Square of "+n+ " is " +sq);
		
		
		
	}

}
