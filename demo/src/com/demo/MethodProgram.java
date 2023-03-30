package com.demo;

import java.util.Scanner;

public class MethodProgram {
	
     public int calculation() {
    	 int a,b ;
    	 int add,sub,mul;
    	 float div;
    	
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("enter a two number: ");
    	  a =s.nextInt();
    	  b =s.nextInt();
    	  add=a+b;
    	  sub=a-b;
    	  mul=a*b;
    	  div=(float)a/b;
    	  System.out.println("addition is:"+add);
    	  System.out.println("substraction is:"+sub);
    	  System.out.println("multiplication is:"+mul);
    	  System.out.println("division is:"+div);
    	  return b ;
     }  
     public static void main(String[]args) {
    	 MethodProgram m =new MethodProgram();
    	 int d=m.calculation();
     }
}
    	 
    	 
    	 
    	 
    	 
    	 
 
    	 
    	 
     
    	  
    	
    	 
    	 
    	 
    	
    	 
    	
    	 
    	 
    	 
    	 
     
    	 
     
    	 
     

