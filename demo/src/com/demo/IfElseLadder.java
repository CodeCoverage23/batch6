package com.demo;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a vaolu: ");
	    int mark =90;
		if (mark<=30)
		{
	        System.out.println("fail");
		}
		else if(mark<=60)
		{
		     System.out.println("C grade");
		}
		else if(mark<=80)
		{
		     System.out.println("B grade");
		}
		else
		{
			System.out.println("A grade");
		}
	}
}
