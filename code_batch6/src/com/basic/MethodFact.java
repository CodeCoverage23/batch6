package com.basic;

public class MethodFact {
	 
		public int FactorialNumber() {
			int fact=1;
			int number=8;
			for(int i=1;i<=number;i++) {
				fact=fact*i;
			}
		return fact;
		}


		public static void main(String[] args) {
	           MethodFact sc=new  MethodFact();
				int result =sc.FactorialNumber();
				System.out.println("facrorial=" +result);
			}    
               


	}
