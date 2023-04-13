package com.assignmentNo5;

// TO find out maximum number among three number 
public class Q_NO__3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g = 77;
		int k = 99;
		int p = 88;

		if (g <= k && g >= p) {
			System.out.println("the max number is " + g);
		} else if (k >= p && p >= g) {
			System.out.println(" the max number is " + k);
		}
		else if (p <= k && p >= k) {
			System.out.println("the max number is " + p);}
	else {
	System.out.println("Invalid number");}

	}

}
