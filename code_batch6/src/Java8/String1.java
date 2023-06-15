package Java8;

public class String1 {

	public static void main(String[] args) {
		String str = "AKSHAY12 @ C67";
		
		for(int i=0; i<str.length(); i++)
		{
			if (!Character.isDigit(str.charAt(i))) 
			{
				//str.trim();
				System.out.print(str.charAt(i));	
			}
			
		}
		
	}

}
