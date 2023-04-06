package com.demo;

public class ThisExample {
int a,b;
	public ThisExample(int a,int b) {
		this.a=a;
		this.b=b;	
		System.out.println("a="+a+" b="+b);
	}
	
	public ThisExample() {
//		this(10,20);
	
		System.out.println("default constructor call");
		
	}
	
	
//	@Override
//	public String toString() {
//		return "ThisExample [a=" + a + ", b=" + b + "]";
//	}

//	void display() {
//		
//		System.out.println("a="+a+" b="+b);
//	}
	
//	void m1() {
//		
//		this.display();
//		
//		
	
	
//	@Override
//	public String toString() {
//		return "ThisExample [a=" + a + ", b=" + b + "]";
//	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisExample thisExample = new ThisExample();
    
//		System.out.println(thisExample);

	}

}
