package com.javabasic;

public class LoppSatement {
public static void main(String[] args) {
	System.out.println("while loop");
	int a=4;//start
	while(a<4) {
		System.out.println(a);
		a++;
	}
	System.out.println("do while");
	int b=4;
	do {
		System.out.println("b is"+b);
		b++;
	}while(b<4);
	
	System.out.println("for loop");
	for(int i=1;i<=4;i++) {
		System.out.println("i is="+i);
	}
}
}
