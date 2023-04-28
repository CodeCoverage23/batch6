package com.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		FileReader fileReader;
		try {
			System.out.println("hello");
			
			fileReader = new FileReader("c:\\user\\abc.text");
			BufferedReader bf	= new	BufferedReader(fileReader);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file does not exist on your system");
		}
		catch(ArithmeticException ar) {
			
			System.out.println("arithmatic exception handle");
			
		}
		finally {
			System.out.println("finally block executed");
			}


		System.out.println("normal flow");
		
	}

}
