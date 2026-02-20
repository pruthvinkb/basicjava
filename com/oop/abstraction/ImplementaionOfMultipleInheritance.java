package com.oop.abstraction;
  //lunch
 interface Prey{
	 int a=0;
	  void run();
  }
 interface Predatar {
	void hunt();
}
 class Lion implements Predatar {

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("lion");
	}
	
	public void sound() {
		// TODO Auto-generated method stub
   System.out.println("grrr");
	}
	
	
 }
 class Deer implements Prey {
     //thier is default constctor create by jvm call the interface
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Deeer");
	}
	 
 }
class Fish implements Prey,Predatar{
	  String type;
	  
	public void run() {
		System.out.println("Small fish is prey for shark");
	}
	public void hunt() {
		System.out.println("shrak hunt samall fish");
	}
}
public class ImplementaionOfMultipleInheritance {
public static void main(String[] args) {
	  
   Lion pr=new Lion();
	pr.hunt();
	pr.sound();
	Prey pr2=new Deer();
	pr2.run();
	
	
}
	
}

