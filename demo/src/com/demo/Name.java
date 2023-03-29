package com.demo;

public class Name {
	
	public static void main(String[]args) {
		
		int i;
		for(i=1;i<=100;i++) {
			
			if(i % (5*7)==0) {
				System.out.println(i+ "Gauri Patkar");
				}
			else if(i % 7==0)
			{
				System.out.println(i+ "Patkar");
			}
			else if(i%5==0) {
				System.out.println(i+ " Gauri");
			}
			else
			{
				System.out.println(i);
			}
				
		}
	}
}
	
		
			
		

