package com.demo;
import java.util.Scanner;

public class SwitchSeason {
	
	public static void main(String[]args) {
		
		String season="";
	    System.out.println("Enter any month from 1 to 12");
	    Scanner sc = new Scanner(System.in);
	    int nextInt = sc.nextInt();
	    switch(nextInt) {
	    
	    case 12: 
	    case 1:
	    case 2:
	    case 3:
	    	season ="Winter";
	    	break;
	    case 4:
	    case 5:
	    case 6:
	    case 7:
	    	season = "Summer";
	    	break;
	    case 8:
	    case 9:
	    case 10:
	    case 11:
	    	season = "Rainy season";
	    	break;
	    		
	    }
	    System.out.println(season);
	    
	    
	    
	}
	

}
