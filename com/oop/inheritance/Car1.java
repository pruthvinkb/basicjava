package com.oop.inheritance;

class car{
	String brand;
	int speed;
	String full;
	public car(String brand,int speed,String full) {
		this.brand=brand;
		this.speed=speed;
		this.full=full;
	}
	public void display() {
		System.out.println(this.brand+this.speed+this.full);
	}
	
}
class Bmw1 extends car{
	public Bmw1(String brand,int speed,String full) {
		 super(brand, speed, full);//this call parent constrctor
		
	}
}
class Swifty extends car{
	public Swifty(String brand,int speed,String full) {
		 super(brand, speed, full);
		
	}
}

public class Car1 {
public static void main(String[] args) {
	car c1=new Bmw1("bmw",10,"full");
	c1.display();
	car c2=new Swifty("swifty",23,"half");
	c2.display();
	
}
}
