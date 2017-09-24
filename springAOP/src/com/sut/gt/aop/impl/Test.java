package com.sut.gt.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		//1、创建spring的IOC容器
		ApplicationContext p = new ClassPathXmlApplicationContext("application-context.xml");
		//2、从IOC容器里获取bean的实例
		ArithmeticCalculator at = (ArithmeticCalculator) p.getBean("arithmeticCalculator");
		//3、使用bean
		
		System.out.println(at.getClass().getName());
		
		int result = at.add(3, 6);
		System.out.println("result : " + result);
		
		result = at.div(6, 3);
		System.out.println("result : " + result);
	}

}
