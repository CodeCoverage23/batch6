package com.demo;
import java.util.*;

public class Switch{
	public static void main(String[] args) {
		
		int month;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter a month");
		 month=sc.nextInt();
		
		switch(month){
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("summer");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("rainy");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("spring");
			break;
			
			
		
		
		
		
		
		
		
			
		}
		
		
		
	}
}