package com.demo;
class Add {
	
	public float add(int a, float b) {
		float c = a+b;
		return c;
	}
	public double add(float a, int b) {
		return a+b;
	}
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
}
public class MethodOverloding {

	public static void main(String[] args) {
		Add a = new Add();
		float add = a.add(33,20.5f);
		double add1= a.add(56.1f,49);
		int add2 = a.add(33,20);
		System.out.println("Addition of two number : " + add);
		System.out.println("Addition of two number : " + add1);
		System.out.println("Addition of two number : " + add2);	
  }
}
