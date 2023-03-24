package com.basic;

import java.util.Scanner;

public class Ifelseladderage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =  new Scanner (System.in);
        
        System.out.println("enter addhar no");
        int no = sc.nextInt();
        System.out.println("enter the name ");
        String name = sc.next();       
         System.out.println("enter the Age");
         int age =sc.nextInt();
         if (age>=50 && age <70 )
         {
        	 System.out.println("senior citizen");
         }
           else if(age>=50 && age<60) {
        	 System.out.println("Younger Citizen");
         }
           else if(age>=40 && age<50) 
           {
        	   System.out.println("Young  Middle Age Adult ");
           }
           else if (age>=20 && age<30 ) {
        	   System.out.println("Adult ager");
        	   
           }else if(age>=10 && age<20) {
        	   System.out.println("teen ager");
        	  
           }
         
           else if (age>=5 && age <10) {
        	   System.out.println("kid Ager");
        	   }
           else if (age>=0 && age<5) {
        	   System.out.println("child ager");
           }
         
           }
         
         
        	   
         
         
        
               

}

