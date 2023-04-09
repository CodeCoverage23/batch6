package Assignments4;

import java.util.Scanner;

public class CalculateTotal {

	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
		System.out.println("Enter the marks for five subjects:");
		int subject1 = ak.nextInt();
		int subject2 = ak.nextInt();
		int subject3 = ak.nextInt();
		int subject4 = ak.nextInt();
		int subject5 = ak.nextInt();
		int total = subject1 + subject2 + subject3 + subject4 + subject5;
		double average = total / 5;
		System.out.println("Total marks = " + total);
		System.out.println("Average marks = " + average);

	}
}
