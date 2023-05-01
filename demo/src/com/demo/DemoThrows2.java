package com.demo;

public class DemoThrows2 {
void m3() throws InterruptedException  {
	Thread.sleep(20);
	
	
}
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

	DemoThrows2 demoThrows2 = new	DemoThrows2();
	demoThrows2.m3();
	System.out.println("normal flow");
		
	}

}
