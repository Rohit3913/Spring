package com.letslearnSpring.lowlevel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
	Person person = (Person)context.getBean("person");
	person.sayHello();
	System.out.println("Real"+person);
	System.out.println((Address)context.getBean("address") );
	((ClassPathXmlApplicationContext)context).close();
	}

}
