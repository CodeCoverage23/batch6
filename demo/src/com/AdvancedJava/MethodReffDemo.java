package com.AdvancedJava;
@FunctionalInterface
interface vehical{
	public void car();
}

public class MethodReffDemo  {
public static void main(String[] args) {
	//static method reference
	vehical v=MethodReffBike ::color;
	
	v.car();
	//non static method reference
	MethodReffBike m = new MethodReffBike();
	vehical v1=m::nameOfBike;
	v1.car();
}


}




