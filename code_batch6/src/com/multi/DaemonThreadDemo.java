package com.multi;

class MyThread7 extends Thread {
	public void run() {

		System.out.println("Runnnig...");
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {

		MyThread7 t = new MyThread7();
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		t.start();
		System.out.println(t.getPriority());

	}

}
