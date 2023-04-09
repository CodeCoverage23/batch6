package Assignments4;

public class Method {
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}
public int sub (int a,int b) {
	int c=a-b;
	return c;
}
public int mul (int a,int b) {
	int c=a*b;
	return c;
}
public int div (int a,int b) {
	int c=a/b;
	return c;
}
	public static void main(String[] args) {
		Method s = new Method();
        System.out.println(s.sum(5, 5));
        Method s1 = new Method();
        System.out.println(s1.sub(5, 5));
        Method s2 = new Method();
        System.out.println(s2.mul(5, 5));
        Method s3 = new Method();
        System.out.println(s3.div(5, 5));
	}
}
