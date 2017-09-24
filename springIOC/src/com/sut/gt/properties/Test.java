package com.sut.gt.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-properties.xml");
		
		DataSource data = (DataSource) p.getBean("dataSource");
		
		System.out.println(data.getConnection());
	}

}
