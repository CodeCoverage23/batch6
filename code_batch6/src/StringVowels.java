
public class StringVowels {
	
	public static void main(String args[])
	{
	
	String str ="India is my country";
	
	for(int i =0; i<=str.length()-1; i++)
		
	{
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='u' )
		{
			System.out.println(str.charAt(i));
		}
	}
	
	}

}
