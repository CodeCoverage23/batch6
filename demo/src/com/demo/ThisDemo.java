package com.demo;

public class ThisDemo {
  ThisDemo getObject() {
	
	return this;
	
	
}
	
	public void m1()
{
System.out.println("current class object call");
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ThisDemo().getObject().m1();
		
//		ThisDemo obj = new ThisDemo();
//		
//		obj.m1();
	}

}
