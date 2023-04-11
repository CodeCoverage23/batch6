package com.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char[] ch = {'S','t','u','d','e','n','t'}; 
   //  String s = new String(ch);
  //   System.out.println(s);
     
     
     
   //  String s = "Hello";
    //  s= s.concat(" World");
   //  String s1 = new String("Hello");
  //  System.out.println(s);
     
     
  //  String s3 = "Hello" + " World";
   // System.out.println(s3);
     
     
     String s  = "Hello";
     String s1 = "world";
     String s2 = "HELLO";
    System.out.println(s==s2);
     System.out.println(s==s1);
     
     
     String s3 = "Hello";
     String s4 = new String("Hello");
    System.out.println(s.equals(s4));
    
     System.out.println(s.equalsIgnoreCase(s2));
	}

}
