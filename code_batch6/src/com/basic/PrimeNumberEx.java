package com.basic;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int counter=0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter value");
        int num=Scanner.nextInt();
        for(int i=1;i<=num;i++) {
		
		if(num%i==0)
		counter++;	
        }		
        if(counter==2)
        {
        	System.out.println(num+" :  Prime");
        }
        else
        {
        System.out.println(num+" : not Prime");
	}
	
	}

}
