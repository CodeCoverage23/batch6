package com.demo;

public class For_Loop_Name_series_HW {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i%(5*7)==0) {
				System.out.println(i + " Mansi Sahu");
			}else if(i%7==0) {
				System.out.println(i + " Sahu");
			}else if(i%5==0){
				System.out.println(i + " Mansi ");
			}else {
				System.out.println(i);
			}
			
			
		}
		
	}
}
