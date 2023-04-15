package com.basic;

public class Demo {
	Demo getobject() {
		return this;
}
	public void m1()
	{
		System.out.println("object call");
	}
	public static void main(String[] args) {
		new Demo().getobject().m1();
	}
	

}
