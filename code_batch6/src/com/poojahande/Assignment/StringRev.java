package com.poojahande.Assignment;
import java.util.Scanner;

public class StringRev {
	String str;
	public static void main(String args[])  
	{  
		char c;
		String str="";
	System.out.print("Enter the string that you want to reverse: ");  
	Scanner sc = new Scanner(System.in);  
	String rev = sc.next();
	
 for (int i = 0;i<rev.length();i++) {
	 c=rev.charAt(i);
	 str=c+str;
	 
 }
 System.out.print("The reverse string is : " +str); 
	} 
	
}
