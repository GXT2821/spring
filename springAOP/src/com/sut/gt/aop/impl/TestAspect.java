package com.sut.gt.aop.impl;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class TestAspect {
	
	@Before("LoggingAspect.declareJoinPointExpression()")
	public void test(JoinPoint joinPoint) {
		System.out.println("data : " + Arrays.asList(joinPoint.getArgs()));
	}

}
