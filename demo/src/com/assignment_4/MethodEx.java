 
// Write the java program to design method for add,sub,mul,div of two number which
//returns int results to that method and result should be print into main method.

package com.assignment_4;

public class MethodEx {
	    
	int a=10;
	int b=15;
	    public int sum (int a,int b) {
		int c = a + b;
		return c;
	 }
        public int sub (int a,int b) {
	    int c = a-b;
	    return c;
     }
        public int mul (int a,int b) {
	    int c = a*b;
	    return c;
     }
        public int div (int a,int b) {
	    int c = a/b;
	    return c;
     }
	public static void main(String[] args) {
		
		MethodEx s = new MethodEx();
        System.out.println(s.sum(10,15));
        
        MethodEx s1 = new MethodEx();
        System.out.println(s1.sub(10,15));
        
        MethodEx s2 = new MethodEx();
        System.out.println(s2.mul(10,15));
        
        MethodEx s3 = new MethodEx();
        System.out.println(s3.div(10,15));
	}
}
