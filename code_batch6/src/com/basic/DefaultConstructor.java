package com.basic;

public class DefaultConstructor {
	int roll;
	String name;
	void display()
	{
		System.out.println(roll+" "+name);
	}
public static void main (String[] args)
{
	DefaultConstructor d1 = new DefaultConstructor();
	d1.display();
}
}