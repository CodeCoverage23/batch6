package com.abstraction;
// abstract keyword is used for hide the internal implementations from user
abstract class Home{
	abstract public void print();
	
	public void print2() {
		System.out.println("Non Abstract methods also print here");
	}
}


public class AbstractKeyWord extends Home{
	
	
	@Override
	public void print() {
		System.out.println("This is a home");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AbstractKeyWord().print();
		new AbstractKeyWord().print2();
		
	}

	

}
