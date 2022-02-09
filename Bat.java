package com.louie.zookeeper;

public class Bat extends Mammal {
	//member variables

	//constructor
	public Bat() {
		super(300);
	}
	
	//methods
	public void fly() {
		 setEnergyLevel(getEnergyLevel() - 50);
		 System.out.println("I believe i can fly");
	}
	
	public void eatHuman() {
		addEnergyLevel(25);
		System.out.println("more.. i need moreeee");
	}
	
	public void attackTown() {
		minusEnergyLevel(100);
		System.out.println("this town is on fiiiiireeeeeeee");
	}
	
	
}
