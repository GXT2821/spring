package com.sut.gt.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;


public class TestAspect {
	
	
	public void test(JoinPoint joinPoint) {
		System.out.println("data : " + Arrays.asList(joinPoint.getArgs()));
	}

}
