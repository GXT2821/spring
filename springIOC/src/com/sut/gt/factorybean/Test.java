package com.sut.gt.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-factorybean.xml");
		
		Car car = (Car) p.getBean("car");
		System.out.println(car);
	}

}
