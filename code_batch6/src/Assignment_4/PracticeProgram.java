package Assignment_4;

import java.util.*;

public class PracticeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c,cpp,java,python;
		double totalmarks, average;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("entar a four subject marks: ");
		
		c = sc.nextInt();
		cpp = sc.nextInt();
		java = sc.nextInt();
		python = sc.nextInt();
		
		totalmarks = c+cpp+java+python;
		average = totalmarks/4;
		
		System.out.println("total marks is : "+totalmarks);
		System.out.println("average is : "+average);
				
	}

}
