package Assignment_5;

import java.util.Scanner;

public class MaximumNumber {

	public MaximumNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int n2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is a Maximum Number");

		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is a Maximum Number");
		} else {
			System.out.println(n3 + " is a Maximum Number");
		}
	}

	public static void main(String[] args) {
		
		MaximumNumber m=new MaximumNumber();
	}
}
