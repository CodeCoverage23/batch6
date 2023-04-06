package com.java;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int g=0;g<10;g++)
		{
			for(int p=10-g;p>1;p--) {
				System.out.print("  ");}
		    for(int k=0; k<=g;k++) {
			System.out.print("  &");
		}
		System.out.println( );
		
	}
 
}}
