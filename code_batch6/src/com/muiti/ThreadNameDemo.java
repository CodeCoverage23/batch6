package com.muiti;

class MyThread2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("running");
	}
}

public class ThreadNameDemo {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		//System.out.println("Avinash");
		System.out.println(Thread.currentThread().getName());
		t.start();
	}
}
