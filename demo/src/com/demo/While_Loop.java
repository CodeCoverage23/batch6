package com.demo;

public class While_Loop {
	
	public static void main(String[] args) {
		int a = 1;
//		while (a <= 10) {
//
//			System.out.println(a);
//			a++;
//			
//			
//		}
		
		//2nd demo of while

		while(a<=15) {
		int b = 2*a;
		a++;
		if (b==20)
			continue;
			
		System.out.println(b);
			
		}
	}
}
