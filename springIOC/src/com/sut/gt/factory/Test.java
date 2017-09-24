package com.sut.gt.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-factory.xml");
		
		Car car =  (Car) p.getBean("car");
		System.out.println(car);
		
		Car car2 =  (Car) p.getBean("car2");
		System.out.println(car2);
	}

}
