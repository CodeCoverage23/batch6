package Assingment5;
// WAP a JAVA PROGRAM TO CHECK NUMBER IS POSITIVE OF NEGITIVE

import java.util.Scanner;

public class PosNiv {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter numver to check Posetive ot negative");
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println("Number is posetive");
		}
		else {
			System.out.println("Number is negative");
			
		}
		

	}

}
