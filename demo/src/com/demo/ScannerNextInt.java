package com.demo;
import java.util.*;

public class ScannerNextInt {
	
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter the marks :");
	
	int percentage=scan.nextInt();
	
	if (percentage<=34) {
		System.out.println("Fail");
		
	}
	else if(percentage>=35) {
		System.out.println("students are pass in exam");
	}
	else if(percentage>=60) {
		System.out.println("1st class");
	}
	else if(percentage>=75) {
		System.out.println("students in distinction");
	}
	else if(percentage>=90) {
		System.out.println("students are topper");
	}
	else {
		System.out.println("Invalid input");
	}
}


}
