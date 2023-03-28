package com.demo;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter any month( 1 to 12)");
    
    String season=Sc.next();
    switch(season) {
    case "October":
    case "November":
    case "December":
    case "January":
    	System.out.println("Winter");
    	break;
    case "February":
    case "March":
    case "April":
    case "May":
    	System.out.println("Summer");
    	break;
    case "June":
    case "July":
    case "August":
    case "September":
       System.out.println(" Rainy");
       break;
     
    }
	}


}