package com.multi;

class Thread11 extends Thread {
	int flag = 0;

	public void run() {
		System.out.println("I am Available for all" + Thread.currentThread().getName());
		synchronized (this) {
			System.out.println("Child thred work");
			for (int i = 1; i <= 5; i++) {
				flag = flag + i;
				this.notify();
			}
		}

	}
}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread11 t = new Thread11();
		t.start();

		synchronized (t) {
			System.out.println("Main thread work");
			t.wait();
			System.out.println("Main thread got notify");
			System.out.println(t.flag);

		}

	}

}
