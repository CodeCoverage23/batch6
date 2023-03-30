package com.demo;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] intArray= {0,1,2,3,4,5,6,7,8,9,10};
		 
		//we want to process only even entries
		for (int i : intArray) {
			if (i % 2 !=0)
				continue;
			System.out.println("Processing enter" + i);
		}
    }
}
