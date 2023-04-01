package com.basic;

public class WhileLoopContinueStatement {

	public static void main(String[] args) {
		int a = 1;

		while (a<=20) {
			if (a==10) {
				a++;
				continue;
			}
			System.out.println(a);
			a++;
		}

	}


	}
