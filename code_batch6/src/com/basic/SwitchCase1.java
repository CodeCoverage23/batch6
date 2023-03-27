package com.basic;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month Name:");
        String name=sc.nextLine();
        switch(name)
        {
        case "February":
        case "March":
        case "April":
        case "May":
        System.out.println("Summer Season");
        break;
        case "Jun":
        case "Jully":
        case "August":
        case "September":
        System.out.println("Mansoon Season");
        break;
        case "Octomber":
        case "November":
        case "December":
        case "January":
        System.out.println("Winter Season");
        break;
        }
	}

}
