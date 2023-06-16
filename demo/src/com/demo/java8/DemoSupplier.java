package com.demo.java8;

import java.util.function.Supplier;

public class DemoSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				// a+=10;
				otp = otp + (int) (Math.random() * 10);// 0<=x<1
			} // String a=null+10;
			return otp;// otp=""+5=5=>5+9=59=>59+7=597821
		};

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
