package com.depenncies.injection.SpringDI;

public class Basket extends Fruits{

	Fruits fruits;

	public Fruits getFruits() {
		return fruits;
	}

	public void setFruits(Fruits fruits) {
		this.fruits = fruits;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.fruits.getName();
	}
	
}
