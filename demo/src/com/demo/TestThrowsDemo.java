package com.demo;

import java.io.IOException;

public class TestThrowsDemo {

	void m()throws IOException{
		
		throw new IOException("device error");
		
	}
	void n() throws IOException {
		m();
		
	}
	void p() throws IOException {
		try{
			n();
		}
		catch(IOException ex) {
			System.out.println("exception handle");
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	TestThrowsDemo testThrowsDemo = new TestThrowsDemo();
		
	testThrowsDemo.p();
	System.out.println("normal flow");
	}

}
