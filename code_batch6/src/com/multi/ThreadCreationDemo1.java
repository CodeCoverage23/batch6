package com.multi;

class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

public class ThreadCreationDemo1 {

	public static void main(String[] args) {

		MyThread1 t = new MyThread1(); // thread created

		t.start();

		System.out.println("Main thread");

	}

}
