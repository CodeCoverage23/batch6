package multithreading;


class MyThread2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("running");
	}
}

public class MythreadDemo2 {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		
		System.out.println(Thread.currentThread().getName());
		t.start();

	}}




