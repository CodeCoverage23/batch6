package com.assignment5;

import java.util.*;

public class even_or_odd {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int number=sc.nextInt();
     if(number%2==0) {
    	 System.out.println("number is even");
     }
     else{
    	 System.out.println("number isn't even or its odd");
     }
	}

}
