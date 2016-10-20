package com.depenncies.injection.SpringDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Grappes extends Fruits {
	
	String name;
	@Autowired
	public void setName(@Value("${user}")String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		
		
		return this.name;
	}

}
