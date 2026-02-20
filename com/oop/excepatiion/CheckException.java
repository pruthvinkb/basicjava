package com.oop.excepatiion;

class a{
	int m=3;
	public String toString() {//we  need use constructoe to send value to tostring
		return "hello this is excrpriment of string ";
	}
}
class Bank{
	String name;
	double balance;

	public Bank(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", balance=" + balance + "]";
	}
	
	
}

public class CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(1);
       System.out.println(2);
       System.out.println(3/3);
       System.out.println(4);
       System.out.println("======");
       
       CheckException c=new CheckException();
       System.out.println(c);
       Bank b=new Bank("Canner",10);
       System.out.println(b);//tostring value print in by using object
       String str="pruthvin";
       System.out.println(str.hashCode());
	}

}
