package com.demo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int m ,
   f =1;
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number");
   m=sc.nextInt();
   for(int i=1;i<=m;i++) {
	    f=f*i;
   }
   System.out.println("factorial" +m+"is "+f);
	}

}
