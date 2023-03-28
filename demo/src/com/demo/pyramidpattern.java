package com.demo;
public class pyramidpattern{
	public static void main(String[] args) {
		char x=65;
		for(int i=0;i<5;i++) {
			for(int k=5-i;k>1;k--) {
				
				System.out.print(" ");
				
				
			}for(int j=0;j<=i;j++) {
				System.out.print(x );
				System.out.print(" ");
				x++;
			}
			System.out.println();
			
		}
		
		
	}
	
}
