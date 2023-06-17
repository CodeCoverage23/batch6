package com.AdvancedJava;

@FunctionalInterface

interface FourWheeler {
	public MethodReffBike Display();
}

public class ConstructorReffDemo  {

	public static void main(String[] args) {

		FourWheeler f =  MethodReffBike:: new;

		
		f.Display();
	}

	
}
