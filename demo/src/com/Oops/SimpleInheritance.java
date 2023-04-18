package com.Oops;

class Bird{
	int legs=2;
	

void fly() {
	System.out.println("i am flying");
}
}

class color extends Bird{
	int feather=2;

void parrot() {
	System.out.println("My clor is grren");
}
}
public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  color p =new color();
  System.out.println(p.legs);
  System.out.println(p.feather);
  p.parrot();
  p.fly();
	}

}
