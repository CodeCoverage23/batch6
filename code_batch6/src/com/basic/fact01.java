package com.basic;



public class fact01 {
	 public int  factor() {
     	
			int fact=1;
			int number=10;
			for(int i=1;i<=number;i++) {
				fact=fact*i;
			}
		return fact;
		}


		public static void main(String[] args) {
	           fact01 sc=new  fact01();
				int result =sc.factor();
				System.out.println("factorial=" +result);
			}    
               


	

    
	 }
	    
    