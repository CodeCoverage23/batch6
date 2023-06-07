package com.muiti;

class MyThread5 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        System.out.println("Avinask-khasde");
	}
}

public class ThreadPariorityDemo2 {
	public static void main(String[] args) {

		MyThread5 t = new MyThread5();
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
		t.setPriority(9);
		t.start();
		
	}
}