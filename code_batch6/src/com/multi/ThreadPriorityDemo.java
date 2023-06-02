package com.multi;

class MyThread4 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
		System.out.println("Running...");
	}

}

public class ThreadPriorityDemo {

	public static void main(String[] args) {

		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

		MyThread4 t = new MyThread4();

		t.setPriority(9);
		t.start();

	}

}
