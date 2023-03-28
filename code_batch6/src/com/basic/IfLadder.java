package com.basic;
import java.util.Scanner;

public class  IfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner Scanner= new Scanner(System.in);
		   System.out.println("enter a age :");
		   int age=Scanner.nextInt();
		  if (age>=18 && age<=60) {
			  System.out.println("Eligibil for all card");
			    }  
			    else if(age>=21 && age<20){  
			        System.out.println("Eligibale for Pancard");  
			    }  
			    else if(age>=18 && age<17){  
			        System.out.println("Eligibale for Adharcard");  
			    }  
			    else if(age>=16 && age<60){ 
			    	System.out.println("Eligibal for two wheeler driving licence ");
			    }  
			    else if(age>=18 && age<60){  
			        System.out.println("Eligibal for Four wheeler driving licence");  
			    }else if(age>=20 && age<60){  
			        System.out.println("Eligibal for transport vehicle driving licence");  
			    }else{  
			       System.out.println("Invalid!");  
			    }  
			}  
			  
	}


