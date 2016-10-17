package com.letslearnSpring.lowlevel;

import java.util.Arrays;

public class Address {

	String street;
	String state;
	String []phoneNumber;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String[] getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address(String street, String state) {
		
		this.street = street;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", phoneNumber=" + Arrays.toString(phoneNumber) + "]";
	}
	
	
}
