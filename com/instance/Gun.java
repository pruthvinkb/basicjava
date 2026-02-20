package com.instance;

public class Gun {
	String name;
	int bullet;
	
	
	public Gun(String name, int bullet) {
		
		this.name = name;
		this.bullet = bullet;
	}

	public void shoot() {
		System.out.println("Gun name is "+name);
		for(int i=0;i<bullet;i++) {
			System.out.println("dishank");
		}
		System.out.println();
	}
}
