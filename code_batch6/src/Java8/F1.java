package Java8;

@FunctionalInterface
interface A
{
	int  add(int a , int b);
}

public class F1 {

	public static void main(String[] args) {
		
		A obj = (a, b)-> a+b;
		int result = obj.add(12, 67);
		System.out.println(result);
		
	}

}
