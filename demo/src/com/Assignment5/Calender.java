package com.Assignment5;
import java.util.*;
public class Calender {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("2009");
			break;
		case 2:
			System.out.println("2010");
			break;
		case 3:
				System.out.println("2010");
			break;
		case 4:
			System.out.println("2011");
			break;
		
		case 5:
			System.out.println("2011");
			break;
		case 6:
			System.out.println("2012");
			break;
		case 7:
			System.out.println("2012");
			break;
		case 8:
			System.out.println("2013");
			break;
		case 9:
			System.out.println("2014");
			break;
		case 10:
			System.out.println("2015");
			break;
		case 11:
			System.out.println("2016");
			break;
		case 12:
			System.out.println("2017");
			break;
      default:
    	  System.out.println("enter month is not in calender");
	}

}
}
