package com.demo.Multithreading;

public class DemoThread extends Thread {
public void run() {
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("daemon thread");
		
	}
	else {
		System.out.println("user thread");
	}
	
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		DemoThread d1= new DemoThread();
		DemoThread d2= new DemoThread();
		DemoThread d3= new DemoThread();
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();

	}

}
