package com.demo;

public class PenNotWorking extends Exception
{
	public PenNotWorking(String errormsg){
		
		
	super(errormsg);
	
}
	
static void penMethod() throws PenNotWorking {
	throw new PenNotWorking("pen not working properly");

}

	public static void main(String[] args) throws PenNotWorking {
		// TODO Auto-generated method stub

		penMethod();

		System.out.println("normal flow");
		
		
	}

}
