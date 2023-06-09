package com.demo.Multithreading;

public class Deadlock {
	final static String r1 = "hello java";
	final static String r2 = "javatpoint";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread() {
			public void run() {
				synchronized (r1) {
					System.out.println("Thread 1 locked r1");
					synchronized (r2) {
						System.out.println("thread 1 lock r2");

					}

				}
			}

		};
		
		Thread t2 =new Thread() {
			public void run() {
				synchronized(r2) {
					System.out.println("thread 2 lock r2");
					
					synchronized(r1) {
						System.out.println("thread 2 lock r1");
					}
					
				}
			}
			
		};
		t1.start();
		t2.start();
		System.out.println("main");

	}

}
