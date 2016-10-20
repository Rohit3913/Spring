package com.depenncies.injection.SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.depenncies.injection.Model.CityDAO;

public class TestingAutoWire {
public static void main(String as[]){
	ApplicationContext applicationContext = new FileSystemXmlApplicationContext("spring-config.xml");
	/*Basket basket=(Basket)applicationContext.getBean("basket");
	System.out.println(basket.getFruits().getName());*/
	//Shop shop=(Shop)applicationContext.getBean("shop");
	//System.out.println(shop.getApple2().getName());
	
	CityDAO cityDAO=(CityDAO)applicationContext.getBean("cityDAO");
	System.out.println(cityDAO.getCities());
}
}
