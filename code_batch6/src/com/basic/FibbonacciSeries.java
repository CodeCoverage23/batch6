package com.basic;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a1=0; int a2=1;
        System.out.print(a1+" "+a2);
        int range=15;
        for( int i=2;i<=range;i++) {
		int a3=a1+a2;
		System.out.print(" "+a3);
		a1=a2;
		a2=a3;
		
		
		
		
        }
		
		
	}

}
