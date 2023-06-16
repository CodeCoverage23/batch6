package com.AdvancedJava;

import java.util.function.Supplier;

public class SupplierDemo  {

	
	public static void main(String[] args) {
		Supplier<String > s=  () ->{
			String OTP="";
			for(int i=0;i<=6;i++) {
				OTP=OTP+(int)(Math.random()*10);
			}
			return OTP;
		
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}

}

