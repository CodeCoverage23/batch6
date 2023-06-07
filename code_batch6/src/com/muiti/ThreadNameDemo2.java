package com.muiti;

class MyThread3 extends Thread {
	public void run() {
		System.out.println("Running");
		Thread.currentThread().setName("Avinash-khadse");
		System.out.println(Thread.currentThread().getName());

	}
}

public class ThreadNameDemo2 {
	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		Thread.currentThread().setName("Sarthk");
		System.out.println(Thread.currentThread().getName());

		t.start();

	}

}
