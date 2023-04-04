package com.demo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("number");
    int n = sc.nextInt();
    int  prime =1;
    if(n>-1) {
    	
    
     for(int i=1;i*1<n;i++) {
    	 if(n%1==0) {
    		 prime=0;
    	 }
}
     if(prime==2) {
    	 System.out.println("number "+n+"prime");
    	 
     }else {
    	 System.out.println("number"+n+"not prime");
     }
	}

}
}

