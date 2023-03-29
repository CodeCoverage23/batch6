package com.demo;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 18;
		String playerName ="";
	   
		switch (number) {
	      case 45:
	        playerName = "Rohit Sharma";
	        break;

	      case 18:
	        playerName = "Virat Kohali";
	        break;

	     
	      case 33:
	        playerName = "Hardik Pandya";
	        break;

	      case 01:
	        playerName = "KL Rahul";
	        break;
	        
	      case 93:
	         playerName = "Jasprit Bumrah" ;
	         break;
	         
	      default:
	        playerName = "Unknown";
	        break;
		
	        
	    }
		System.out.println(playerName);
	}

}
