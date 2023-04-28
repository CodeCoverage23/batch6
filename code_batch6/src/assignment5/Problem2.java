package assignment5;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the Year");
    int i=sc.nextInt();
    if(i%4==0) {
    	System.out.println("This is leap year");
    }
    else
    {
    	System.out.println("This is not leap year");
    }
	}

	
}
