package com.AdvancedJava;
interface predicate<Integer>{
	public boolean test(Integer t);
}


public class PredicateDemo implements predicate<Integer>  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PredicateDemo p1 = new PredicateDemo();
		
		System.out.println(p1.test(20));
	}

	@Override
	public boolean test(java.lang.Integer t) {
		// TODO Auto-generated method stub
		if (t%2==0) {
			return true;
		}else
			
		return false;
	}

}
