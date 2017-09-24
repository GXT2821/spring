package com.sut.gt.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sut.gt.autowrie.Address;

public class Test {
	public static void main(String[] args) {
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-relation.xml");
		
		Address address = (Address) p.getBean("address");
		System.out.println(address);
		
		address = (Address) p.getBean("address2");
		System.out.println(address);
	}

}
