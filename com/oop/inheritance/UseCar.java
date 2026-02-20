package com.oop.inheritance;


abstract class CarMarket{
	 String name;
	 int speed;
	 abstract void showSpeed();
 }
 class Bmw extends CarMarket{
	 
	public void showSpeed() {
		// TODO Auto-generated method stub
		name="bmw";
		speed=120;
        System.out.println("name is"+name+"speed of car"+speed);
	}
 }
 class Swift extends CarMarket{
	 public void showSpeed() {
			// TODO Auto-generated method stub
			speed=10;
			name="Swift";
	        System.out.println("name is"+name+"speed of car"+speed);
		}
 }
 public class UseCar {
 public static void main(String[] args) {
	 CarMarket s=new Swift();
	 s.showSpeed();//polymophism
	 CarMarket s2=new Bmw();
	 s2.showSpeed();
}
}
