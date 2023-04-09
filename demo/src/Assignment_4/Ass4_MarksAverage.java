package Assignment_4;

import java.util.Scanner;

public class Ass4_MarksAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English Marks");
		double english = sc.nextDouble();
		System.out.println("Enter Math Marks");
		double math = sc.nextDouble();
		System.out.println("Enter Science Marks");
		double science = sc.nextDouble();
		System.out.println("Enter History Marks");
		double history = sc.nextDouble();
		System.out.println("Enter Physic Marks");
		double physic = sc.nextDouble();

		double total = english + math + science + history + physic;
		System.out.println("Total Marks = " + total);

		double average = total / 500 * 100;

		System.out.println("Average of all Subject = " + average);
	}

}
