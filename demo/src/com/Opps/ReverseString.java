package com.Opps;

public class ReverseString {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s = "Gargi";
          System.out.println("Before String:" +s);
          int length = s.length();
          String r ="";
          for(int i = length-1;i>=0;i--) {
        	  r=r+s.charAt(i);
          }
          System.out.println("after string :"+r);
	}

}
