package com.instance;

public class HowerClock_Short {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int space=-1;
    int star=7;
    int n=5;
    for(int row=1;row<=n;row++) {
    	  if(row<=3) {
    		  star-=2;
    		  space++;
    	  }
    	  else {
    		  star+=2;
    		  space--;
    	  }
    	  //space
    	  for(int i=1;i<=space;i++) {
    		  System.out.print(" ");
    	  }
    	  //star
    	  for(int i=1;i<=star;i++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
    }
	}

}
