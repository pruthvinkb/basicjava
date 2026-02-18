package com.instance;
 class Bmw{
	 
	  static void display(String model,long price,String mg) {
		 System.out.println("model is"+model+"price is"+price+"mg"+mg);
	 }
 }

public class Car {
public static void main(String[] args) {
 Bmw.display("v13054", 7000000l, "12");
	
}
}
