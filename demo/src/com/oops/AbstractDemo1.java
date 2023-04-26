package com.oops;

abstract class vehicale2{
	String bikecolour="yellow";
	public vehicale2() {
		System.out.println("vehicale");
		
	}
   abstract void run();
   public void displayspeed() {
	   System.out.println("20/hr");
   }}

   class Yamaha extends vehicale2{
	   
	   @overide
	   void run() {
		   System.out.println("bike is running");
	   }
	   void display() {
		   System.out.println(super.bikecolour);
	   }
   
public class AbstractDemo1 {

	public static void main(String[] args) {
		
          Yamaha y=new Yamaha();
         
          y.display();
          y.displayspeed();
          y.run();
          
	}

}
}