package com.demo;

public class MethodExample {

	public void Factorail() {
	
	int fact=1;
	int num=5;
	for(int i=1;i<=num;i++)
	{
	   fact=fact*i;
	
	}
	System.out.println(fact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodExample obj=new MethodExample();
	
		obj.Factorail();

	}

}
