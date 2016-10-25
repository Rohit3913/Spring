package com.rohit.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.web.DAO.EmployeeDAO;
import com.rohit.web.Model.City;

@Service("empService")
public class EmployeeService {
	@Autowired
	private EmployeeDAO empDAO;

	public List<City> getEmployee(){
		
		return empDAO.getCities();
	}
	
	
}
