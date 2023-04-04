package com.demo;

public class PrimeNo {
	int num,i;
	static void primr(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) 
				count++;
				
			}
			if(count==2) 
				System.out.println(num+"is prime");
			
			else 
				System.out.println(num+"is not prime");
				
			}
		
				
			public static void main(String[] args) {
				
		      	primr(2);
				primr(1);
				primr(23);
			}


}
	


	