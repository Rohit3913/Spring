package com.depenncies.injection.SpringDI;

import org.springframework.beans.factory.annotation.Value;

public class Orange extends Fruits {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
