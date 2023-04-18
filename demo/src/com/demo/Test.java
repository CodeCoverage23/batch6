//Simple Inheristance

package com.demo;

 class bird{
	 int legs = 2;
	 void fly() {
		 System.out.println("I am flying");
		 
	 }
 }
 class Parrot extends bird{
	 int feathers = 2;
void WhatColourAmI() {
System.out.println("My colour is green");

}
 }
 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot p = new Parrot();
		System.out.println(p.legs);
		System.out.println(p.feathers);
		p.fly();
		p.WhatColourAmI();

	}

}
