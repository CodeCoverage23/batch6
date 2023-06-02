package com.multi;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadCreationDemo2 {

	public static void main(String[] args) {

		MyThread2 t = new MyThread2();
		Thread d = new Thread(t);
		d.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

	public static void main(String[] args, int a) {
		MyThread2 t = new MyThread2();
		t.run();
		System.out.println("Overloaded");
	}

}
