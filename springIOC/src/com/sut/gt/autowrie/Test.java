package com.sut.gt.autowrie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] main){
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-autowire.xml");
		
		Person person = (Person) p.getBean("person");
		System.out.println(person);
	}
	
	

}
