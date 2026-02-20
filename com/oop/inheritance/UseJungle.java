package com.oop.inheritance;
  class Animal{
	  int leg;
	  String sound;
	  int hands;
	  public Animal(int leg,String sound) {
		// TODO Auto-generated constructor stub
		  this.leg=leg;
		  this.sound=sound;
	  }
	  @Override
	  public String toString() {
		return "Animal [leg=" + leg + ", sound=" + sound + "hand="+hands+"]";
	  }
	 
  }
  class Tiger extends Animal{

	public Tiger(int leg, String sound) {
		super(leg, sound);
		this.sound=sound;
		// TODO Auto-generated constructor stub
	}
	  
  }
  class Kan extends Animal{
	public Kan(int leg, String sound,int hands) {
		super(leg, sound);
		this.hands=hands;//this spefiyg the p\object
		// TODO Auto-generated constructor stub
	}
	
	  
  }
public class UseJungle {
public static void main(String[] args) {
	//poylmo
	Animal ti=new Tiger(4,"Tiger");
	System.out.println(ti);
	ti=new Kan(2,"kang",2);//to string method will be in object
	System.out.println(ti);
}
}
