package Assignment4.copy;

public class Subject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int Core_java = 87;
      int Software_Engineering = 81;
      int NetworkSecurity = 86;
      int Computer_Graphics = 95;
      int E_Commerce = 73;
      
      int total = Core_java + Software_Engineering + NetworkSecurity + Computer_Graphics + E_Commerce;
          float avg = total/5;
          System.out.println("Total of five sub marks: " +total);
          System.out.println("Average of five sub marks: " + avg);
      
	}

}
