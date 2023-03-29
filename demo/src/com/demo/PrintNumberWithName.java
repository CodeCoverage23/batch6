package com.demo;

public class PrintNumberWithName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(int i=1; i<=100;i++) {
	 
	  
	if(i%(5*7)==0) {
		 System.out.println("Gargi Bardeo");
	 } else if(i%5==0) {
		 System.out.println(i + "Gargi ");
	 }else if (i%(5*7)==0) {
			  System.out.println( i+ " Bardeo");
		  }else {
			  System.out.println(i);
		  }
	 }
 
	}

}

