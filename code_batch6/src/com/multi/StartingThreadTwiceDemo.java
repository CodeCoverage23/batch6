package com.multi;

class MyThread6 extends Thread {

	public void run() {
		System.out.println("Running...");
	}

}

public class StartingThreadTwiceDemo {

	public static void main(String[] args) {

		MyThread6 t = new MyThread6();

		t.start();

		MyThread6 t2 = new MyThread6();

		t2.start();
	}

}
