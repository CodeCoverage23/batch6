package com.demo;
import java.util.Scanner;

public class PalindromNum {
	public static void main(String[]args) {
 int n, s=0, rev,c;
 
 System.out.println("Enter the number");
 Scanner sc = new Scanner(System.in);
 n= sc.nextInt();
 c = n;
 
 while(n>0)
 {
	 rev=n%10;
	 s= (s*10)+rev;
	 n=n/10;
 }
 if(c==s)
    System.out.println("Palindrome Number");
 else
	 System.out.println("Not Palindrome Number");
 
}
}
