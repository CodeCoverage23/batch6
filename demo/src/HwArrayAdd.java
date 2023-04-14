import java.util.Scanner;

//WAP to  print addition and avg of five subject in array take input from console.
public class HwArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of subject: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int sum=0;
		int A[]= {a,b,c,d,e};
		
		for(int i=0;i<A.length;i++) {
			
			sum=sum+A[i];
			
		}
		
		System.out.println(" Addition of five subject is: "+sum);
		
		int avg=sum/5;
		System.out.println(" Average of five subject is: "+avg);
		
		
		
		
		

	}

}
