package com.demo;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int c=0;
  int d=1;
  System.out.println(c+" "+d);
  int a;
  for(int i=1;i<=20;i++) {
	  a =c+d;
	  System.out.println(" "+a);
	  c=d;
	  d=a;
  }
		  
	}

}
