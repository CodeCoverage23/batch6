package assignment5;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20;
    int b=35;
    int c=90;
    if(a>=b && a>=c) {
    	System.out.println("Maximum number is: "+ a);
    }
    else if(b>=a && b>=c) {
    	System.out.println("Maximum number is: "+ b);
    }
    else {
    	System.out.println("Maximum number is: "+ c);
    }
	}

}
