package com.demo;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Age");
       int age = sc.nextInt();
       if(age>=38&& age<=50) {
    	   System.out.println("they are old");
    	   
    	   }  else if(age>=27 && age<38){
    		   System.out.println("they are young");
       }
    	   else if(age>=17 && age<27) {
    		   System.out.println("they are above hundreds");
    	   }
	}

}
