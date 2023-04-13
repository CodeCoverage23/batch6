package com.Assignment5;

public class Maximum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 15;
      int b = 45;
      int c = 35;
      
      if(a>=b && a>=c) {
    	  System.out.println("Maximum_Number is : " + a);
      }
      else if(b>=a && b>=c) {
    	  System.out.println("Maximlum_Numbre is : " + b);
    	  
      }
     else  if (c>=a && c>=b) {
    	 System.out.println("Maximum_Number is : " + c);
     }
	}

}
