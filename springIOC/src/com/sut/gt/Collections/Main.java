package com.sut.gt.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		//创建spring的IOC容器对象
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("spring.xml");
		
		//从IOC中获取Bean实例
		
		Person person = (Person) apc.getBean("person3");
		System.out.println(person);
	}
	

}
