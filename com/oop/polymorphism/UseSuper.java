package com.oop.polymorphism;
class a{
	a(){
		System.out.println("a constrctor");
	}
}
class b extends a{
	public b() {
		super();
		System.out.println("B constroctor");
	}
}

public class UseSuper {
public static void main(String[] args) {
	b ab=new b();
}
}
