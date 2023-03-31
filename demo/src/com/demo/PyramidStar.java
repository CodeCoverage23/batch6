package com.demo;

public class PyramidStar {
	public static void main(String[] args) {
	      for(int i=0;i<=10;i++) {
	    	  for(int k=5-1;k>=i;k--) {
	    		  for(int j=0;j<=i;j++) {
	    			  System.out.print(" * ");
	    		  }
	    	  }
	    	  System.out.println();
	      }
	      
	}

}
 