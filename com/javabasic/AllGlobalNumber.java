package com.javabasic;


public class AllGlobalNumber {

	public static void main(String[] args) {
		
  	int a=3;
//  	post increment: use value first then change in memory
     System.out.println(a++);
     System.out.println(a);
    
    int b=4;
    int c=b--;
     System.out.println(b);
     System.out.println(c);
     System.out.println("c "+c);
//     check the number is divisible by both 3 &4
     System.out.println(3==0);    
     System.out.println(3!=4);     
     System.out.println(3!=3);
      System.out.println("=============");
     System.out.println("logical operters");
     System.out.println("And(&&)");
     System.out.println(true &&true&&false);
     System.out.println(true&&true&&true);
      System.out.println(false&&true);
      System.out.println("OR(||) ====");
      System.out.println(false|| true||false);
     System.out.println(true||false);
      System.out.println(false||false);
      System.out.println("======");
		
		int n=10;
//		divisiblity checked by(remainder ==0)
		System.out.println(n%3==0 && n%4==0);
		System.out.println("movie and race");
		System.out.println(n%3==0);
		System.out.println(n%4==0);
      
		System.out.println("=========");
		System.out.println("Eligibility for marriage");
		System.out.println("age is 22 to 32");
		
		int age=21;
		System.out.println(age>=22 && age <=32);
}
}
