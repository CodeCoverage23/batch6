package com.Assignment1;

public class AllNumber {
	  int sum(int a,int b) {
		 int c = a+b;
		 return c;
		 
	 }
	 int  sub(int a,int b) {
		 int c=(a-b);
		 return c;
		 
	 }
	 int multi(int a,int b) {
		 int c =(a*b);
		 return c;
	 }
	 int div(int a ,int b) {
		 int c=(a/b);
		 
  return c;
		 
	 }

	public static void main(String[] args) {
		AllNumber an = new AllNumber();
		System.out.println(an.sum(12, 45));
		AllNumber an1 = new AllNumber();
		System.out.println(an1.sub(12, 45));
		AllNumber an2 = new AllNumber();
		System.out.println(an2.div(12, 45));
		AllNumber an3 = new AllNumber();
		System.out.println(an3.multi(12 ,45));
		

	}

}
