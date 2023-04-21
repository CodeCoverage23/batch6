package com.demo;
class Device{
	
	public Device() {
		System.out.println(" device");
	}
	public Device( String device) {
		System.out.println(" device is : "+device);
	}
	
}
class Printer extends Device{
	public Printer() {
		super("mouse");
		System.out.println("printer");
		
		
	}
	
	
}


public class MethodOverWithCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Printer printer = new Printer();
	}

}
