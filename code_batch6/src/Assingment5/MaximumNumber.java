package Assingment5;
import java.util.*;
public class MaximumNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x , y, z;
		System.out.println("Enter a value x:");
		 x = sc.nextInt();
		 System.out.println("Enter a value of y:");
		 y = sc.nextInt();
		 System.out.println("Enter a value of z");
		 z= sc.nextInt();
		 
		 if(x>y&&x>z)
		 {
			 System.out.println("X is maximum:"+ x);
		 }
		 else if(y>x&&y>z)
		 {
			 System.out.println("Y is maximum number:"+ y);
		 }
		 else {
			 System.out.println("Z is Maximum:"+ z);
		 }
		
	}

}
