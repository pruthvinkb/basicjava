package com.oop.inheritance;
  class parent{
	  public void talent() {
		  System.out.println("study hard get job");
	  }
  }
  class Child extends parent{

	@Override
	public void talent() {
		// TODO Auto-generated method stub
		   System.out.println("work hard ");
			super.talent();
		}
	}
	  
  
public class UseOverriding {
	public static void main(String[] args) {
		parent p=new Child();
		p.talent();
	}
}
