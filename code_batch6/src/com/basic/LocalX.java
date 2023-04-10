package com.basic;

public class LocalX {
	
	public int local() {
		int x=5;
		System.out.println(x);
		return(x);
	}
	
	
	public static void main(String[] args) {
		LocalX t=new LocalX();
		t.local();

	}

}
