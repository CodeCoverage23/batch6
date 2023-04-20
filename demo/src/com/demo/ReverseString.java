package com.demo;

public class ReverseString {

	public static void main(String[] args) {
//with for loop
		String name="Shweta";
		
		System.out.println("string before revers:"+name);
   
  int length =name.length();
  String rev=" ";
  
  for(int i=length-1;i>=0;i--) {
	  
	  rev=rev+name.charAt(i);
  }
  System.out.println("string after revers:"+rev);
//without for loop
  StringBuffer sb  =new StringBuffer("shweta");
  System.out.println("string before revers:"+sb);
  
  StringBuffer reverse = sb.reverse();
  System.out.println("string after revers:"+reverse);
	}

}
