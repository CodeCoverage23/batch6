package com.Demo;

import java.util.Scanner;

public class switch_ {
   public static void main(String[] args) {
		int age=15; //hardcoded value
       // System.out.println("enter age"); //comt when hardcode
		//Scanner sc=new Scanner(System.in);//comt when hardcode
	    //int nextInt= sc.nextInt();//comt when hardcode
		String msg = " ";
		switch(age) { //(in brace age where hardcode)
		case 10:
	    msg="valid for the adhar";
	    break;
		case 12:
		msg="valid for the pan";
		break;
		case 18:
	    msg="valid for vote";
	    break;
	    default:
	   msg="age not found";	
	   break;
		}
		System.out.println(msg);
	}

}
