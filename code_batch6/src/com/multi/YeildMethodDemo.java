package com.multi;

class MyThread5 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}

	}

}

public class YeildMethodDemo {

	public static void main(String[] args) {

		MyThread5 t = new MyThread5();
		t.start();
		t.setPriority(7);
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
