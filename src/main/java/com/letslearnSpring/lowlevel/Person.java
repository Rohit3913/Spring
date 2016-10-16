package com.letslearnSpring.lowlevel;

public class Person {
	int id;
	String name;
	int taxId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("hello");
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
public void sayHello(){
	
	System.out.println("Hello!! User, How are you ");
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Name:- "+ this.name +" ID:- "+this.id +" TaxId " + this.taxId;
}
public int getTaxId() {
	return taxId;
}
public void setTaxId(int taxId) {
	this.taxId = taxId;
}
}
