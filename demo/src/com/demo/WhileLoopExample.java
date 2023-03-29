package com.demo;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		
		while(a<=10) {
			if(a==4){
				a++;
				continue;
			}
			System.out.println(a);
		a++;
		}
		
	}
}

