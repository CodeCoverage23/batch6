package com.oops;
class birds{
	int leg=2;
	void fly() {
		System.out.println("i am flying");
	}
}
   class Parrot extends birds{
	   
	   int feather=2;
	   void colour() {
		   System.out.println("my colour is green");
		   
	   }
   }
      public class Test1{
    	 public static void main (String[] args) {
    		 
    		 Parrot p=new Parrot();
    		  System.out.println(p.leg);
    		  System.out.println(p.feather);
    		  p.fly();
    		  p.colour();
    	  }
      }