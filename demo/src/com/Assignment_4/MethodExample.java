//WAP to design method for a addition,substraction,multip;ication,division of two number which returns 0i00000nt results to that method and result should be print into main method

package com.Assignment_4;

public class MethodExample {
	public int sum(int a,int b) {
		int c = a + b;
		return c;
	}
	
	public int sub(int a ,int b) {
		int c = a - b;
		return c;
	}
	
	public int mul(int a,int b) {
		int c = a * b;
		return c;
	}
	
	public int div(int a,int b) {
		int c = a / b;
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample m = new MethodExample();
		System.out.println(m.sum(12, 7));
		MethodExample m1 = new MethodExample(); 
		System.out.println(m1.sub(12, 7));
		MethodExample m2 = new MethodExample();
		System.out.println(m2.mul(12, 7));
		MethodExample m3 = new MethodExample();
		System.out.println(m3.div(12, 7));
		
	}
}
