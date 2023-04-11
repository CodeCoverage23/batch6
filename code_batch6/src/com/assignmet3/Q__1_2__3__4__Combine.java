package com.assignmet3;

//Create method for Addition,Subtraction,
//Multiplication and Division 
public class Q__1_2__3__4__Combine {

	public int add(int g, int p) {
		int k = g + p;

		return k;
	}

	public int sub(int g, int p) {
		int k = g - p;
		return k;
	}

	public int into(int g, int p) {
		int k = g * p;
		return k;
	}

	public int div(int g, int p) {
		int k = g / p;
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //create object for store/call the values of methods
		// in main method
		Q__1_2__3__4__Combine sc1 = new Q__1_2__3__4__Combine();
		int result = sc1.add(100, 50);
		System.out.println(result);
		// in that case we reduce one step of create new variable
		// like result for store the value but for our understand
		// I add that step.
		// anyway we add that value in print statement.
		Q__1_2__3__4__Combine sc2 = new Q__1_2__3__4__Combine();
		int value = sc2.sub(100, 50);
		System.out.println(value);
		Q__1_2__3__4__Combine sc3 = new Q__1_2__3__4__Combine();
		int multi = sc3.into(100, 50);
		System.out.println(multi);
		Q__1_2__3__4__Combine sc4 = new Q__1_2__3__4__Combine();
		int div = sc4.div(100, 50);
		System.out.println(div);
	}

}
