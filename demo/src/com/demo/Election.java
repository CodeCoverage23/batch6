package com.demo;

import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
  System.out.println("enter the number");
   int number = sc.nextInt();
//   String name = sc.next();
   if(number == 1 ) {
	   System.out.println("gargi");
   }
   else if(number == 2) {
	   System.out.println("Pradeep");
	   
   }
   else if(number ==3) {
	   System.out.println("mayuri");
   }
   else {
	   System.out.println("No name");
   }
	}

}
