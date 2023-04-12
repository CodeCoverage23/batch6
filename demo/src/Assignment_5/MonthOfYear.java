package Assignment_5;

import java.util.Scanner;

public class MonthOfYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Month");
		String month = sc.next();

		switch (month) {

		case "January":
			System.out.println("January");
			break;

		case "February":
			System.out.println("February ");
			break;
		case "March":
			System.out.println("March ");
			break;
		case "April":
			System.out.println("April ");
			break;
		case "May":
			System.out.println("May ");
			break;
		case "June":
			System.out.println("June ");
			break;
		case "July":
			System.out.println("July ");
			break;
		case "August":
			System.out.println("August ");
			break;
		case "September":
			System.out.println("September ");
			break;
		case "October":
			System.out.println("October ");
			break;
		case "November":
			System.out.println("November ");
			break;
		case "December":
			System.out.println("December ");
			break;
		default:
			System.out.println("Invalid Month");
		}
	}

}
