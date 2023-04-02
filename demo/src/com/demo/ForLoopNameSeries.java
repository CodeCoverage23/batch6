package com.demo;

public class ForLoopNameSeries {

	public static void main(String[] args) {
		for(int i=1; i<=100;i++) {

			if(i%(5*7)==0){
			System.out.println(i+ " Mayuri Baywar" );
			//continue;
		   	}
		    else if (i%5==0) {
			 System.out.println(i+ " Mayuri" );
		    }
			 else if (i%7==0) {
				 System.out.println(i+ " Baywar" );
		    }
		  }
    	}   
	}
