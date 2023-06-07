package Assignments4;

import java.util.Scanner;

public class Calculator {


		public static void main(String[] args) {
			Scanner ak=new Scanner(System.in);
			System.out.println("Enter first Number : ");
			int a = ak.nextInt();
			System.out.println("Enter second Number : ");
			int b=ak.nextInt();
			Calculator(a,b);
		}

		public static void Calculator(int a, int b) {
			int sum =a+b;
			int sub=a-b;
			int mul= a*b;
			int div= a/b;
			
			System.out.println("Addition is "+ sum);
			System.out.println("Subtrtaction is "+ sub);
			System.out.println("Multiplication is : "+mul);
			System.out.println("Division is : "+div);
			
		}
	}



