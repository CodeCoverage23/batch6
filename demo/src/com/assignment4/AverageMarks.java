
//Write a java program to calculate total of five subject marks and average of it.
package com.assignment4;
import java.util.Scanner;

public class AverageMarks {
	public static void main(String[]args) {
		float mar,eng,phy,chem,bio;
		double total,average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five subjects");
		System.out.println("Enter the marks of Marathi subjects");
		mar = sc.nextFloat();
		System.out.println("Enter the marks of English subjects");
		eng = sc.nextFloat();
		System.out.println("Enter the marks of Physics subjects");
		phy = sc.nextFloat();
		System.out.println("Enter the marks of Chemistry subjects");
		chem = sc.nextFloat();
		System.out.println("Enter the marks of Biology subjects");
		bio = sc.nextFloat();
		
		total = mar+eng+phy+chem+bio;
		average = (total/5.0);
		
		System.out.println("Total marks of five subsject is" +total);
		System.out.println("Average of five subjects is" +average);
	} 

}
