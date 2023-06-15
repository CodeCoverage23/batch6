package Java8;

import java.util.function.Supplier;

public class OtpGenerator {

	public static void amin(String args[])
	{
		Supplier<String> s =()->{
			
			String otp = "";
			for(int i=0; i<6; i++)
			{
				otp= otp+(int)Math.random()*10;
			}
			return otp;	
		};
		System.out.println(s.get());
	}
}
