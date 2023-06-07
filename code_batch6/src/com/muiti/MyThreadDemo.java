package com.muiti;

class MyThread1 extends Thread {
	public void run() {
		System.out.println("Running ");

	}
}

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		System.out.println("My Thread");
		t.start();

	}

}
