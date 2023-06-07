package com.muiti;

class MyThread4 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("Aviash ");
	}
}

public class ThreadPariorityDemo1 {
	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("khadse");
		t.start();

	}

}
