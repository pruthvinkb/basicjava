package com.oop.abstraction;

public class Excepation_Air {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println(2/0);
			System.out.println(s.charAt(1));
		}catch(Exception e) {
			System.out.println("this misssing");
	}

	}
}
