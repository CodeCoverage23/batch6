package com.demo.Multithreading;

class StringName {

	public final static String resource1 = "lock1";
	public final static String resource2 = "lock2";

}

class SThread extends Thread {

	public void run() {
		synchronized (StringName.resource1) {
			System.out.println("Thread 1 lock resource 1");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (StringName.resource2) {
				System.out.println("Thread 1 lock resource 2");
			}
		}
	}
}

class YThread extends Thread {
	public void run() {
		synchronized (StringName.resource2) {

			System.out.println("Thread 2 lock resource 2");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (StringName.resource1) {
				System.out.println("Thread 2 lock resource 1");
			}
		}
	}
}

public class DemoThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SThread t1 = new SThread();
		YThread t2 = new YThread();
		t1.start();
		t2.start();

	}

}
