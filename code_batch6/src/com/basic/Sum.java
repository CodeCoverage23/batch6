package com.basic;

public class Sum {
int a; 
int b;
public Sum( int a ,int b)
{
	
	 this.a=a;
	 this.b=b;
}

@Override
public String toString() {
	return " [a+b]";
}


public static void main(String[] args) {
	Sum add = new Sum(101,26);
	System.out.println(add);
}
}
