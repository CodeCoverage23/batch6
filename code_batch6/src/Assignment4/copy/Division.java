package Assignment4.copy;

public class Division {
	public int getDivision(int a, int b) {
		int c = a / b;
		return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Division division = new Division();
       int sum = division.getDivision(70, 20);
       System.out.println("division of two numbers: " + sum);
	}

}
