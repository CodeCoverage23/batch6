// 6) WAP to print the global variable value as 25

package com.Assignment2;

public class GlobalVariableEx_6 {
	int y = 25;
	public int LocalVariable() {
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GlobalVariableEx_6 t = new  GlobalVariableEx_6();
		 int y=t.LocalVariable();
		 System.out.println(y);
		

	}

}
