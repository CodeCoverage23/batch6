package Assingment5;

// wap java code to check enter number is greater than 100;
import java.util.*;
public class Num100 {

	public static void main(String[] args) {
	
         Scanner sc= new Scanner(System.in);
         int num;
         System.out.println("Enter number to check:");
         num = sc.nextInt();
         if(num>100)
         {
        	 System.out.println("Your enter number is Gretter than 100");
         }
         else
         {
        	 System.out.println("Your enter number is less than hundred");
         }
         
	}

}
