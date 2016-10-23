package com.depenncies.injection.SpringDI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.depenncies.injection.Model.CityDAO;
import com.depenncies.injection.Model.Employee;
import com.depenncies.injection.Model.EmployeeDAO;
import com.depenncies.injection.Model.NamesSpecificJDBCDAO;

public class TestingAutoWire {
public static void main(String as[]){
	ApplicationContext applicationContext = new FileSystemXmlApplicationContext("spring-config.xml");
	/*Basket basket=(Basket)applicationContext.getBean("basket");
	System.out.println(basket.getFruits().getName());*/
	//Shop shop=(Shop)applicationContext.getBean("shop");
	//System.out.println(shop.getApple2().getName());
	
	CityDAO cityDAO=(CityDAO)applicationContext.getBean("cityDAO");
	System.out.println(cityDAO.getCities());
	
	NamesSpecificJDBCDAO NSDAO=(NamesSpecificJDBCDAO)applicationContext.getBean("NSDAO");
	System.out.println(NSDAO.getCities());
	
	EmployeeDAO dao = (EmployeeDAO)applicationContext.getBean("empDAO");
	/*Employee employee1 = new Employee("Rakesh", "INDIA", "IT");
	Employee employee2 = new Employee("Yadav", "USA", "LAWYER");
	Employee employee3 = new Employee("Jinping", "JAPAN", "CA");
	Employee employee4 = new Employee("David", "ENGLAND", "Doctor");
	List<Employee> employees = new ArrayList<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	employees.add(employee3);
	employees.add(employee4);
	System.out.println(dao.batchUpdate(employees));*/
	Employee employee1 = new Employee(11,"Rakesh", "INDIA", "IT");
	Employee employee2 = new Employee(12,"Yadav", "USA", "LAWYER");
	Employee employee3 = new Employee(10,"Jinping", "JAPAN", "CA");
	Employee employee4 = new Employee(13,"David", "ENGLAND", "Doctor");
	List<Employee> employees = new ArrayList<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	employees.add(employee3);
	employees.add(employee4);
	
	System.out.println(dao.batchUpdateWithId(employees));
}
}
