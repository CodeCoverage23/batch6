package com.demo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner (System.in);
  int y = sc.nextInt();
  System.out.println("print number");
  if(y%2==0) {
	  System.out.println("Number is even");
  }
  else {
	  System.out.println("number is odd");
  }
	}

}
 