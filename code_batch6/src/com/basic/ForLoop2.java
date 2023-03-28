package com.basic;

public class ForLoop2 {

	public static void main(String[] args) 
	{
		for(int i=1;i<101;i++)
		{
			System.out.print(i);
			if(i%5==0)
			{
			  System.out.print(" Suraj");
			}
			System.out.println();
			if(i%7==0)
			{
				System.out.print(" Rathod ");
			}
			System.out.println();
			if(i%5==0 && i%7==0)
			{
				System.out.print(" Suraj Ganesh Rathod ");
			}
		}

	}

}
