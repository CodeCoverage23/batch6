package com.basic;

public class ThisExample {
	int a,b;
	public ThisExample (int a, int b) {
		this.a=a;
		this.b=b;
	}
	public ThisExample() {
		this(10,20);
		System.out.println("Avinash");
	}
void display() {
System.out.println("a="+a+  "b="+b);
}

	public static void main(String[] args) {
	ThisExample ThisExample = new ThisExample();
	ThisExample.display();
	//System.out.println();
		// TODO Auto-generated method stub

	}
}


