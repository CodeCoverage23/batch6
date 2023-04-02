package com.demo;

public class PrimeNumbers {
	

	static //private static final char[] PrimeNumber = null;
	//private static String PrimeNumbers = null;
        String PrimeNumbers=" ";
	public static void main(String[] args) {
		int i;
		int num;
		for(i=1;i<=100;i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {
				 PrimeNumbers= PrimeNumbers+i+" ";
			}

	}
       System.out.println("Prime Numbers from 1 to 100: ");
       System.out.println(PrimeNumbers);
		
	}
}
