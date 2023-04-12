package Assignment4.copy;

public class Multiplication  {
    public int getMultiplication(int a, int b) {
    	int c = a * b;
      return c ;    	
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Multiplication multiplication = new Multiplication();
     int sum = multiplication.getMultiplication(25, 45); 
     System.out.println("multiplication of two numbers: " + sum );
	}

}
