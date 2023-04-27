package com.java;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			int count=0 ;
			for( int g=1;g<=i;g++) {
			if (i%g==0){
			count++ ;
			}}
			
		if(count==2 ) {
			System.out.println(i);
		}
	}

	}}
