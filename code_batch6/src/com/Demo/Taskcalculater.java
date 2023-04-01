package com.Demo;
 
import java.util.*;

public class Taskcalculater {

 public static void main(String[] args) {
	
     Scanner scanner =new Scanner(System.in);
      System.out.println("enter numbers");
      int a=scanner.nextInt();
      int b=scanner.nextInt();
		 calculater (a,b);
	}
     public static void calculater(int a, int b) {
    	 int sum=a+b;
    	 int sub=a-b;
    	 int mul= a*b;
    	 int div=a/b;
    	 
    	 System.out.println("sum of two number"+ sum);
 		 System.out.println("subtraction of two number"+ sub);
 		 System.out.println("mul of two number"+ a*b);
 		 System.out.println("div of two number"+ a/b);

     }
    	 
	
}