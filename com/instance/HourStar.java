package com.instance;

public class HourStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int space=-1;
    int star=7;
    //half pattern
       for(int row=1;row<=3;row++) {
    	   star-=2;
    	   space++;
    	   //space loop
    	   for(int i=1;i<=space;i++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=star;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       
       //second half
       star=1;
       space=2;
       for(int row=1;row<=2;row++) {
    	   star+=2;
    	   space--;
    	   //space loop
    	   for(int i=1;i<=space;i++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=star;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
      
	}

}
