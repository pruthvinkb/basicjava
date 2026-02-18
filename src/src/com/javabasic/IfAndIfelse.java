package com.javabasic;

public class IfAndIfelse {
public static void main(String[] args) {
	System.out.println("check prime ");
	int number=2;
	if(number/1==0&&number/number==0) {
		System.out.println("prime");
	}
	System.out.println("Driving license check");
	int driveAge=23;
	if(driveAge>=18&&driveAge<=62) {
		System.out.println("You can have driving license");
	}
	else {
		System.out.println("your not eligible for license ");
	}
	System.out.println("Marriage eligible or not");	int age=12;
	if(age>=18&&age<=60) {
		System.out.println("you can marry");
		
	}
	else {
		System.out.println("you out of marriage age");
	}
	
	System.out.println("Checking the range");
	int range=45;
	if(range>=22&&range<=32) {
		System.out.println("Range is Bound");
	}
	else {
		System.out.println("Range is not Bound");
	}
}
}
