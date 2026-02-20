package com.saticmethods;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int given=145;
     boolean check= checkStrongNo(given);
     if(check) {
    	   System.out.println("give no is"+given+"is strong");
     }
     else {
    	    System.out.println("not strong number");
     }
	}

	private static boolean checkStrongNo(int given) {
		// TODO Auto-generated method stub
		int output=0;
		int n=given;
		while(given>0) {
			int remainder=given%10;
			int fact=factorial(remainder);
			System.out.println("factrial of number"+remainder+"="+fact);
			output=output+fact;
			given=given/10;
		}
		return n==output;
		
	}

	private static int factorial(int remainder) {
		// TODO Auto-generated method stub
		int prod=1;
		for(int i=1;i<=remainder;i++) {
			prod=prod*i;
			}
		return prod;
	}

}
