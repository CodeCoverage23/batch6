package com.demo;

public class WhileLoopContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		
		while (a<=15) {
			if (a==10) {
				a++;
				continue;
			}
			System.out.println(a);
			a++;
		}

	}

}
