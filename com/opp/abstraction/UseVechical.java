package com.opp.abstraction;
  abstract class Vechical{
	 abstract void display();
 }
  class Bike extends Vechical{
	 void display() {
		 System.out.println("I Love bike");
	 }
  }
  class Car extends Vechical{
	  void display() {
			 System.out.println("I Love Car");
		 }
  }
  class lorry extends Vechical{
	  void display() {
			 System.out.println("I Love lorry");
		 }
  }
public class UseVechical {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Vechical v=new Bike();
     v=new Car();//abstaction (along with using polymosisim)
     v=new lorry();
     //down casting
     System.out.println(v instanceof Bike);
    	
     }
	}


