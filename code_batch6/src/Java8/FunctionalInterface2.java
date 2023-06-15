package Java8;

@FunctionalInterface
interface sayable{
	void say(String msg);
}
public class FunctionalInterface2 {
	
	public void say(String msg)
	{
		System.out.println(msg);
	}
	
	public static void main(String args[])
	{
		FunctionalInterface2 f1 = new FunctionalInterface2();
		f1.say("hello akshay/");
	}

}
