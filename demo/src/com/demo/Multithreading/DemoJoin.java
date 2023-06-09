package com.demo.Multithreading;

public class DemoJoin extends Thread {
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("the current thread name is"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoJoin t=new DemoJoin();
		DemoJoin t1=new DemoJoin();
		DemoJoin t2=new DemoJoin();
		t.start();
		t.setName("first Thread");
		System.out.println("current Thread name is "+Thread.currentThread().getName());
		t.join();
		t1.start();
		t1.setName("second thread");
		System.out.println("current thread name is "+Thread.currentThread().getName());
		
		t2.start();
		t2.setName("third thread");
		System.out.println("current thread name is "+Thread.currentThread().getName());
		
		
		
	}

}
