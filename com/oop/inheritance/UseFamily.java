package com.oop.inheritance;
 class Father{
	 String property1="home";
	 String Property2="Car";
	  
	 public void talent() {
		// TODO Auto-generated method stub
       System.out.println("Study hard and get job");
	}
 }
 class Son extends Father{
	 
 }
public class UseFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Son s=new Son();
    System.out.println(s.property1);
    System.out.println(s.Property2); 
    s.talent();
    
	}

}
