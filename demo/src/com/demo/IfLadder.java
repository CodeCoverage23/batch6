package com.demo;

import java.util.Scanner;

public class IfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Scanner  sc = new Scanner(System.in);
 System.out.println("Enter the marks");
//   int id = sc.nextInt();
//System.out.println("Enter The Name");
//   String name = sc.next();
   int marks = sc.nextInt();
   if(marks>=80 && marks<=90) {
	   System.out.println("grade A++");
   }
   else if(marks>=70&& marks<=80) {
	   System.out.println("grade A");
   }
   else if(marks>60 && marks<70) {
	   System.out.println("grade b");
   }
   else if(marks>=50 && marks<60) {
	   System.out.println("grade c");
	   
   }
   else if(marks>=40 && marks<50) {
	   System.out.println("grade c");
	   
   }
   else if(marks>=30 && marks<40) {
	   System.out.println("grade d");
   }
   else if(marks>=20 && marks<30) {
	   System.out.println("grade e");
	   
   }
   else if (marks>=10&& marks<20) {
	   System.out.println("worst student");
   }
	   
	   
	}

}
