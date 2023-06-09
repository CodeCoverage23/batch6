package com.demo.Multithreading;
class Table{
	public void Display(int n)
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
class Mythread1 extends Thread{
	Table obj ;
	 public Mythread1(Table obj) {
       this.obj=obj;	 
	}
	public void run() {
	obj.Display(6);	
		
	}
}
class Mythread2 extends Thread{
	Table t;
	public Mythread2(Table t) {

this.t=t;
}
public void run() {
	
	t.Display(8);
	
}
	
	
}

public class SynchronizedDemo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj =new Table();
		Mythread1 t1=new Mythread1(obj);
		t1.start();
		Mythread2 t2=new Mythread2(obj);
		t2.start();
	}
	

}
