package com.demo;

import java.util.Scanner;
// java program to check number is armstrong or not
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.print ("Enter a number to check amstrong number : ");
     int num=sc.nextInt();
     
     int digit=0;
     int temp=num;
     // digit count operation
     while(temp>0) {
    	 temp=temp/10;
    	 digit++;
    	  
     }
	int lastdigit=num;
		int sum=0;
		// armstrong calculation logic
		while(lastdigit>0) {
		int	last=lastdigit%10;
		sum+=Math.pow(last,digit);
		lastdigit=lastdigit/10;
			
		}
		//comparison of org number with result
		if(sum==num) {
			System.out.println(num+" : is armstrong number");
			
		}
		else
			System.out.println(num+" : is not armstrong number");
		
		
		
	}

}
