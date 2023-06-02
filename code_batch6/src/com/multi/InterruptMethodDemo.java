package com.multi;

class SlideShow1 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Next Photo");
			try {
				Thread.sleep(2000, 10000);
			} catch (InterruptedException e) {

				System.out.println("I got interrupted");
			}
		}
	}

}

public class InterruptMethodDemo {

	public static void main(String[] args) {

		SlideShow1 t = new SlideShow1();
		t.start();
		t.interrupt();

		System.out.println("I am main THREAD");

	}

}
