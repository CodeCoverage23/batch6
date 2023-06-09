package com.demo.Multithreading;


class Table1{
	public static synchronized void Display(int n)
	{
		System.out.println("display");
		for(int i=0;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class MythreadFirst extends Thread{
	
	public void run() {
	Table1.Display(6);	
		
	}
}
class MythreadSecond extends Thread{
	
public void run() {
	
	Table1.Display(8);
	
}
	
	
}

public class StaticDemo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MythreadFirst t1=new MythreadFirst();
		t1.start();
		MythreadSecond t2=new MythreadSecond();
		t2.start();
	}
	

}

