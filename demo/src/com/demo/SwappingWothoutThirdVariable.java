package com.demo;
// java program without using third variable
public class SwappingWothoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		System.out.println("value before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value after swapping: "+a+" "+b);
		
	}

}
