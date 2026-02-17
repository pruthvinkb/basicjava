package com.javabasic;

public class UseHome {
   public static void main(String[] args) {
	     UseHome.kitchen();//static metod accesed by class name 
	     UseHome.dinningHall();
	     UseHome.bedRoom();
	     
}

   private static void bedRoom() {
	// TODO Auto-generated method stub
	   System.out.println("Sleep and Recharge");
	
}

   private static void dinningHall() {
	// TODO Auto-generated method stub
	System.out.println("Eating Food");
}

   private static void kitchen() {
	// TODO Auto-generated method stub
	System.out.println("coook food");
   }
}
