package com.multi;

class Display {

	public synchronized void wish(String name) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good Morning : " + name);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}

	}
}

class MyThread10 extends Thread {

	Display d;
	String name;

	public MyThread10(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d = new Display();

		MyThread10 t1 = new MyThread10(d, "Modiji");
		MyThread10 t2 = new MyThread10(d, "Yogiji");

		t1.start();
		t2.start();

	}

}
