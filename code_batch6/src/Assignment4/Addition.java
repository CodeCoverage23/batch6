package Assignment4;

public class Addition {
    public int getAddition(int a, int b) {
  int c = a + b;
   return c;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Addition addition = new Addition();
     int sum = addition.getAddition(40,70);
     System.out.println("Addition of two numbers:" + sum);
	}

}
