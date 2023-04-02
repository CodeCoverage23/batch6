package com.demo;

public class MethodFactorialExample {

    public int FactorialNumber() {
	   int fact=1;
	   int num=6;
	   for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	 return fact;
			}

	public static void main(String[] args) {
     MethodFactorialExample sc=new MethodFactorialExample();
	     int result =sc.FactorialNumber();
    	System.out.println("facrorial=" +result);
    	
				}
	}


