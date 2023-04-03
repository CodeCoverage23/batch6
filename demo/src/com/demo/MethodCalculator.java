package com.demo;
import java.util.Scanner;
public class MethodCalculator {
	public static int Calculator()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		float div = a/b;
		System.out.println("addition is :"+add);
		System.out.println("substraction is :"+sub);
		System.out.println("multiplication is :"+mul);
		System.out.println("division :"+div);
		return b;
	}
 public static void main(String[]args) {
	 MethodCalculator cal = new MethodCalculator();
	 int d = cal.Calculator();
	
 }
}
