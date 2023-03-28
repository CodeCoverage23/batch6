package com.basic;

public class ForLoop1 {

	public static void main(String[] args) 
	{
		int i,j,b,c=2;
		for(j=1;j<10;j++)
		{
			for(i=1;i<=10;i++)
			{
				b=c*i;
				System.out.print(b+" ");
			}
			if(i>10)
			{
				i=1;
				b=0;
				c++;
				System.out.println();
			}
		}

	}

}
