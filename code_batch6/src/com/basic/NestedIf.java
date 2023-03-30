package com.basic;
/**
 * 
 * @author Swapnil
 *	
 */
public class NestedIf {
	
	public static void main(String[] args) {

		int a = 15;
		if (a < 20) {
			System.out.println("A = " + a);

			if (a % 3 == 0) {
				System.out.println("Divide by 3");
			}
		}

		System.out.println("Rest of the code");

	}

}
