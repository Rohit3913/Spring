package com.rohit.web.Model;

import javax.validation.constraints.Size;

public class Employee {
	int id;
	@Size(max=10)
	String empName;
	String empCountry;
	String empProfession;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCountry() {
		return empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}

	public String getEmpProfession() {
		return empProfession;
	}

	public void setEmpProfession(String empProfession) {
		this.empProfession = empProfession;
	}

	public Employee(String empName, String empCountry, String empProfession) {
		this.empName = empName;
		this.empCountry = empCountry;
		this.empProfession = empProfession;
	}
	public Employee(int id, String empName, String empCountry, String empProfession) {
		super();
		this.id = id;
		this.empName = empName;
		this.empCountry = empCountry;
		this.empProfession = empProfession;
	}

	public Employee() {
	}
}
