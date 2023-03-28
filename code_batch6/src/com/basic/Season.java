package com.basic;

import java.util.Scanner;
public class Season{
 public static void main(String args[]){
    String season;
    Scanner sc = new Scanner (System.in);
   System.out.println("Enter Any  number");
    int entry = sc.nextInt();
      switch (entry)
        {
            case 12:System.out.println("December");
            season = "Winter";
           break;
           
            case 1:System.out.println("january");
            season = "Winter";
            break;
            case 2:System.out.println("febraury");
            season = "Winter";
            break;
            case 3:System.out.println("march");
            season = "Spring";
            break;
            case 4:System.out.println("april");
            season = "Spring";
            break;
            case 5:System.out.println("may");
            season = "Spring";
            break;
            case 6:System.out.println("june");
            season = "Summer";          
            break;
            case 7:System.out.println("july");
            season = "Summer";
            break;
            case 8:System.out.println("august");
            season = "Summer";
            break;
            case 9:System.out.println("september");
            season = "Autumn";
            break;
            case 10:System.out.println("octomber");
            season = "Autumn";
            break;
            case 11:System.out.println("november");
            season = "Autumn";
            break;
            default:
            season = "Invalid Month";
       }
        System.out.println("The entered month is in the " +season + ".");
   }
 }
