package com.letslearnSpring.lowlevel;

public class Person {
	int id;
	String name;
	int taxId;
	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("hello");
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void sayHello() {

		System.out.println("Hello!! User, How are you ");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public void afterPerson(){
		System.out.println("so this is what is created "+this);
	}
	public void destroyPerson(){
		System.out.println("so this is what is Destroyed "+this);
	}
}
