package com.basicAssignment4;

public class Calculated {

	public int add (int x, int y) {
		int z= x+y;
		return z;
		
	}
      
	
	public int sub(int x, int y) {
		int z= x-y;
		return z;
		
	}		public int mul(int x, int y) {
		int z= x*y;
		return z;
		
	}	public int div (int x, int y) {
		int z= x/y;
		return z;
		
	}
	public static void main(String[]args) {
		
		 Calculated s1=  new  Calculated ();
		System.out.println(s1.add(9 ,4));
		Calculated s2=  new  Calculated ();
		System.out.println(s2.sub(9 ,4));
		Calculated s3=  new  Calculated ();
		System.out.println(s3.mul(9 ,4));
		Calculated s4=  new  Calculated ();
		System.out.println(s4.div(9 ,4));
	}
	
	
		
	
	
	
	
	
	
		}
