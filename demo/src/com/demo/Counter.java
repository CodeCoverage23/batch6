package com.demo;

public class Counter {
	
	 int counter=0;
	

	public Counter() {
		super();
		counter++;
		System.out.println(counter);
	}

	public static void main(String[] args) {
	
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		Counter counter4 = new Counter();
		Counter counter5 = new Counter();

	}

}
