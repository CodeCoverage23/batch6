package com.task;

import java.util.Scanner;

public class MenuDriveConstructor {

	public MenuDriveConstructor() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to 4 Number");
		int num = sc.nextInt();
		
		System.out.println("Enter any number");
		int a = sc.nextInt();
		System.out.println("Enter any number");
		int b = sc.nextInt();
		switch (num) {

		case 1:
			System.out.println("Addition= " + (a+b));
			break;

		case 2:
			System.out.println("Multiplication= " +(a*b));
			break;

		case 3:
			System.out.println("Substraction= " + (a-b));
			break;

		case 4:
			System.out.println("Division= "+ (a/b));
			break;

		default:
			System.out.println("Invalid Input");

		}

	}
	public static void main(String[] args) {
		MenuDriveConstructor me=new MenuDriveConstructor();
		System.out.println(me);
	}
	

}
