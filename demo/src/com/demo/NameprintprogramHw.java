package com.demo;

public class NameprintprogramHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i;
       for(i=1;i<=100;i++) {
    	   
    	   if(i%(5*7)==0) {
    		   System.out.println(i+ "Bhavika Bhele");
    		  }
    	   else if(i%7==0)
    	   {
    		   System.out.println("Bhele");
    	   }
    	   else if(i%5==0) {
    		   System.out.println("Bhavika");
    	   }
    	   else
    	   {
    		System.out.println(i);   
    	   }
       }
       
	}

}
