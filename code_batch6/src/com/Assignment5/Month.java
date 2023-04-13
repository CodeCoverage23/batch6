package com.Assignment5;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   System.out.println ("Enter the month (1 to 12)");
   int n = s.nextInt();
   String month_Name;
   switch (n) {
   case 1:
   month_Name = "January";
   break;
   case 2:
	   month_Name = "Febuary";
   break;
   case 3:
	   month_Name = "March";
   break;
   case 4:
	   month_Name = "April";
   case 5:
	   month_Name = "MAy";
	   break;
   case 6:
	   month_Name = "June";
	  
	   break;
   case 7:
	   month_Name = "July";
	   break;
	   
   case 8:
	   month_Name = "August";
	   break;
	   
   case 9:
	   month_Name = "September";
   break;
   case 10:
	   month_Name = "October";
	   break;
   case 11:
	   month_Name = "November";
   break;
   case 12:
	   month_Name = "December";
	   break;
	
   default:
	   month_Name = "Not Found";
	   break;
   }
   System.out.println(month_Name);
	   
   }
   
		   
   
	}


