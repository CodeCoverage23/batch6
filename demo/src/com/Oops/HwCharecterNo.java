package com.Oops;

public class HwCharecterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Code Coverage";
		
//		int i = name.length();
//		
//		System.out.println(i);
		
		int count=0;
		//count each character except space
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') { 
				count++;}
		}
		
System.out.println(count);
	}
	
}
