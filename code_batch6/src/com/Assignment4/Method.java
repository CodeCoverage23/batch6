package com.Assignment4;

public class Method {

 public int sum(int a, int b) {
	 int c=a+b;
	return c;
 }
 public int sub(int a, int b) {
	 int c=a-b;
	 return c;
	 
 }
	
	public int mul(int a, int b) {
		int c=a*b;
		return c;
	}
	public int div(int a, int b) {
		int c=a/b;
		return c;
	}

   public static void main(String[]args) {
	   
	Method s=new Method();
	System.out.println(s.sum(10, 05));
	Method s1=new Method();
	System.out.println(s1.sub(10, 05));
	Method s2=new Method();
	System.out.println(s2.mul(10, 5));
	Method s3= new Method();
	System.out.println(s3.div(10, 5));
	   
	   
	   
   }
	
}	
	
	
	
	
	



	


