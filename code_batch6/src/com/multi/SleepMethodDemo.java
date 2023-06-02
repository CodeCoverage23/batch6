package com.multi;

class SlideShow extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Next Photo");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class SleepMethodDemo {

	public static void main(String[] args) {
		SlideShow t = new SlideShow();

		t.start();

	}

}
