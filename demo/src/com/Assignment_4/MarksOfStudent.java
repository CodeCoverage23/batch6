//WAP to calculate total of five subject marks and avarege of it.
package com.Assignment_4;

import java.util.Scanner;

public class MarksOfStudent {
	public static void main(String[] args) {
		int phy = 90;
		int chem = 89;
		int math = 67;
		int bio = 88;
		int comp = 87;

		int Total = phy + chem + math + bio + comp;
		int Average = (Total / 5);

		System.out.println("Total marks = " + Total);
		System.out.println("Average marks = " + Average);

	}
}