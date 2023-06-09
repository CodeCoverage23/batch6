package com.demo.java8;
interface SquareEx{
public void square(int n);		
}

public class Demo8 implements SquareEx  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SquareEx s=new Demo8();
		s.square(25);
		
		
	}

	@Override
	public void square(int n) {
		// TODO Auto-generated method stub
		
	int square=n*n;
    System.out.println("square of a "+n+" is "+square);
		
	}

}
