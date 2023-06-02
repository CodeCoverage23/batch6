package com.multi;

class MyThread9 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Code Coverage");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class JoinMethodDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread9 t = new MyThread9();

		t.start();
		t.join();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Java Classes");
		}

	}

}
