package com.demo;
import java.util.*;

public class EvenOdd {
 public static void main(String[] args) {
	 Scanner scan =new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int a=scan.nextInt();
	 if(a%2==0) {
		 System.out.println("The  given number is even");
	 }
	 else {
		 System.out.println("The given number is odd");
	 }
}
}
