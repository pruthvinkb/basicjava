package com.instance;
 class Flower{
	 String color;
	 int petals;
	 void details(String color,int petals,String reason) {
		 System.out.println("Color is"+color);
		 System.out.println("petaiols is"+petals);
		 System.out.println("response is"+reason);
	 }
 }
public class UseFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Flower f=new Flower();
      f.details("red",4,"poision");
	}

}
