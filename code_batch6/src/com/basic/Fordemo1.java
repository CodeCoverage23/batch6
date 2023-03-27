package com.basic;

public class Fordemo1 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1; i<=10; i++) 
		{
			for(int j=2; j<=10; j++) 
			{
				num=i*j;
				System.out.print(num+ " ");
			}
			System.out.println();
		}
		

	}

}
