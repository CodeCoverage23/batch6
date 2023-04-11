package com.demo;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int  num = sc.nextInt();
int org_num=num;
int  rev=0;
    
    	while (num!=0) {
    		  rev=rev*10 +num%10;
    		  num=num /10;
    				  
    	}
    	if (org_num==rev) {
    		System.out.println(org_num+" Palindron is numb");
    	}else {
    		System.out.println(org_num+" not palindrom num");
    	}
    

	}

}
