package com.depenncies.injection.SpringDI;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Shop {

	Fruits apple2;

	public Fruits getApple2() {
		return apple2;
	}
	@Inject
	@Named("grappes")
	public void setApple2(Fruits abcs) {
		this.apple2 = abcs;
	}
	
	
}
