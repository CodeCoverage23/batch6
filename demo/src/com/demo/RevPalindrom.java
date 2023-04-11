package com.demo;

import java.util.Scanner;

public class RevPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("number");
   int num =sc.nextInt();
   int org_num=num;
   int reve =0;
   while(num !=0) {
	   reve = reve *10+num%10;
	   num=num /10;
			   
   }
   System.out.println(reve);
	}

}
