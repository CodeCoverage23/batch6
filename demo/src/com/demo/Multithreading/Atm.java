package com.demo.Multithreading;

class Costumer {
	int amount = 10000;

	synchronized void withDraw(int amount) {
		System.out.println("going to withdraw");
		if (this.amount < amount) {
			System.out.println("insufficiant balance,amount is more than saving amount");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			this.amount = this.amount - amount;
			System.out.println("amount is succesfully withdraw");
			System.out.println("remaining balance "+this.amount);
		
	}

	synchronized void deposit(int amount) {
		System.out.println("goint to deposit ammount");
		this.amount = this.amount + amount;
		System.out.println("deposit successfully");
		System.out.println("total amount "+this.amount);
		notify();
	}

}

public class Atm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final Costumer c =new Costumer();
        Thread t1=new Thread(){
        public void run() {
        c.withDraw(8000);	
        	
        }
        };
        Thread t2=new Thread(){
            public void run() {
            c.deposit(10000);	
            }      	
        };
		
        t1.start();
        t2.start();
        
        
	}

}
