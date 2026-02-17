package com.loops.starpatterns;

public class Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=0;
     for(int row=1;row<=5;row++) {
    	   if(row<=3) {
    		   star++;
    	   }
    	   else {
    		   star--;
    	   }
    	  for(int collum=1;collum<=star;collum++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
    	   
      }
	}

}
