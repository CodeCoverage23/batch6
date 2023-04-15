package com.basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r, sum=0, temp;
int n=12121;
temp=n;
while(n>0) {
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
}
	if(temp==sum)
		System.out.println("palindrom Number");
	else
		System.out.println("Not Palindrom");
		
	}

}
