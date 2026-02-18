package com.javabasic;

public class GetFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     GetFactorial.fact(5);
	}

	private static void fact(int n) {
		// TODO Auto-generated method stub
		int fact=1;
		if(n<=1) {
			return ;
		}
		else {
		for(int i=1;i<=n;i++) {
			fact=fact*i;//(fact*i) like this called accumalatrion
		}
		System.out.println("factroial "+fact);
		}
	}

}
