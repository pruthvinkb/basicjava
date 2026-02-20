package com.oop.polymorphism;
class parent{
	int age;//golabal variable
	public parent(int age) {
		this.age = age;
		System.out.println("Parent consttactor done"+age);
	}
}

class Child extends parent{

	public Child(int age) {
	    super(age);
		System.out.println("child constctor done");
	}
	
}
public class TestSuper {
public static void main(String[] args) {
	Child c=new Child(20);
	System.out.println(c.age);
}
}
