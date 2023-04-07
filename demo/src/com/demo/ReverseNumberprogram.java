package com.demo;

import java.util.Scanner;

public class ReverseNumberprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int n,reverse = 0;
		int r = sc.nextInt();
          while(r!=0) {
        	  reverse=reverse*10;
        	  reverse=reverse+ r%10;
        	  r=r/10;
        	  }
          System.out.println("Reverse of the number is"+reverse);

	}

}
