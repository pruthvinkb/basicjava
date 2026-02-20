package com.instance;
  class Bike{
	  String brand;
	  int speed;
	  static int wheel=2;
	   void details() {
		  System.out.println("brand is"+brand+"speed"+speed);
	  }
  }
public class UdeBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(Bike.wheel);
        Bike b=new Bike();
        b.speed=220;
        b.brand="r15";
        b.details();
	}

}
