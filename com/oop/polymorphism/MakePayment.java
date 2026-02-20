package com.oop.polymorphism;
import java.util.Scanner;
abstract class Payment {
	protected double amount;
	protected String transactionId;
	
	public Payment(double amount) {
		super();
		this.amount = amount;
		this.transactionId = "TXN"+System.currentTimeMillis();
	}

	public abstract void pay();

	public void printReceipt() {
		System.out.println("transactionId" + this.transactionId);
		System.out.println("amount" + this.amount);
	}

	
}
class Upipayment extends Payment{
	private String upiId;

	public Upipayment(double amount,String upiId) {
		super(amount);
		this.upiId=upiId;
	}

	@Override
	public void pay() {
		System.out.println("Paying");
		
	}

	
	
}
 class CardPayment extends Payment{
	 protected String CardNumber;
    public CardPayment(double amount,String CardNumber) {
    	  super(amount);
    	  this.CardNumber=CardNumber;
    }
	 @Override
	 public void pay() {
		// TODO Auto-generated method stub
		System.out.println("paying"+super.amount+"thorugh card ending"+this.CardNumber.substring(this.CardNumber.length()-4));
	System.out.println("payment sucesss");
	 }
	 
 }
public class MakePayment {
	 protected int m=3;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i=1;
		while(i!=0) {
			System.out.println("1.upi \n2.Card \n3.exit");
			int choice=sc.nextInt();
		    Payment pay=null;
		    switch(choice) {
		    case 1:
		    	pay=new Upipayment(15419,"653478673@ybl");
		    	pay.pay();
		    pay.printReceipt() ;
		    System.out.println("=========");
		    break;
		    case 2:
		    	pay= new CardPayment(7655,"2435443345");
		    	pay.pay();
		    pay.printReceipt();
		    System.out.println("=========");
		    break;
		    default: System.out.println("invalid option");
		    }
		}
			
	}
}
			
			

		
  //  Payment pay=new Upipayment(15419,"653478673@ybl");
  //  pay.pay();
   //  
 // pay.printReceipt() ;
 // System.out.println("=========");
 // pay= new CardPayment(7655,"2435443345");
 //   pay.pay();
 //   pay.printReceipt();
	