package com.demo;
interface Room{
	void display(); 
}
interface Home{
	
	void display(); 

	
}

class Chair implements Home,Room{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("output");
	}

	
	
	
//	public void run() {
//		// TODO Auto-generated method stub
//		
//		
//		System.out.println("run");
//	}
//	
}





public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair r=new Chair();
		r.display();
		
		
		
	}

}
