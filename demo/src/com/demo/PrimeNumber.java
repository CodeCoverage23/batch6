package com.demo;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int m=0,n=0,i=1,j=1;  
		while(n<25) {  
		j=1;  
		m=0;  
		while(j<=i) {  
		if(i%j==0)  
		m++;  
		j++;   
		}  
		if(m==2){ 
		System.out.printf("%d ",i);  
		n++;  
		}  
		i++;  
		}    
	   }  
	}


