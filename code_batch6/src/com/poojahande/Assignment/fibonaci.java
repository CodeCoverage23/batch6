package com.poojahande.Assignment;

public class fibonaci {

	public static void main(String[] args) {

	    int n = 10, firstnum = 0, secondnum = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstnum + ", ");

	      // compute the next term
	      int fibnum = firstnum + secondnum;
	      firstnum = secondnum;
	      secondnum = fibnum;
	    }
	    
	}  
}
