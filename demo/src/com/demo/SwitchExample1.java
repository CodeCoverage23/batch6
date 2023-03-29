package com.demo;

import java.util.Scanner ;

public class SwitchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        System.out.println("Enter the month");
        String season= sc.next();
         switch (season) {
          
         // case
        
         case "February" :
  
         case  "March" :
             
         case "April":
            
         case  "May":
        	 
        	 System.out.println("season : Summer");
             break;
             
         case "June":
        	 
         case  "July":
            
         case  "August":
              
          case  "September":
        	  
        	  System.out.println("season : Mansoon");
              break;
              
          case  "Octomber":
             
          case  "November":
             
          case  "December":
             
          case  "January":
        	  
        	  System.out.println("season : Winter");
              break;
             default: System.out.println("Invalid Input");
         }
	}
}
