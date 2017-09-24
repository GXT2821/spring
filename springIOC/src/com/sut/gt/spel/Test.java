package com.sut.gt.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] main){
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-spel.xml");
		
		Address address = (Address) p.getBean("address");
		System.out.println(address);
		
		Car car = (Car) p.getBean("car");
		System.out.println(car);
		
		Person person = (Person) p.getBean("person");
		System.out.println(person);
	}
	
	

}
