package com.demo;

public class PrimeNumber {
	
	static String PrimeNumbers=" ";

	public static void main(String[] args) {
		
		int i;
		int number;
		
		for(i=1; i<=100; i++) {
			int count=0;
			for(number=i; number>=1; number--) {
				if(i%number==0) {
					count=count+1;
				}
			}
			if(count==2) {
				PrimeNumbers= PrimeNumbers+i+" ";
			}
		}
		System.out.println(PrimeNumbers);

	}

		
	}
