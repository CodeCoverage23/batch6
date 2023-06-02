package com.multi;

class MyThread3 extends Thread {

	public void run() {
		Thread.currentThread().setName("Code-Coverage");
		System.out.println(Thread.currentThread().getName());
		System.out.println("Running...");
	}

}

public class ThreadNameDemo {

	public static void main(String[] args) { // main thread

		System.out.println(Thread.currentThread().getName());

		MyThread3 t = new MyThread3();// user thread
		t.start();

		Thread.currentThread().setName("CC-2");
		System.out.println(Thread.currentThread().getName());
	}

}
