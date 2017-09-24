package com.sut.gt.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-generic-di.xml");
		
		UserService user = (UserService) p.getBean("userService");
		user.add();
	}

}
