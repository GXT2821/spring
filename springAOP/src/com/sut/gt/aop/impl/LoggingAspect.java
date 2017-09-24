package com.sut.gt.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//把这个类声明为一个切面：需要把该类放到IOC容器中，在声明为一个切面
@Order(2)
@Aspect 
@Component
public class LoggingAspect {
	
	@Pointcut("execution(public int com.sut.gt.aop.impl.ArithmeticCalculator.*(..))")
	public void declareJoinPointExpression() {
		
	}
/*	//声明该方法是一个前置通知：在目标方法开始之前执行
	@Before("execution(public int com.sut.gt.aop.impl.ArithmeticCalculator.*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The mehtod " + methodName +" begins with " + list);
	}
	
	//后置通知：在目标方法执行之后（无论是否发生异常），执行的通知
	@After("execution(public int com.sut.gt.aop.impl.ArithmeticCalculator.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The mehtod " + methodName +" ends");
	}
	//返回通知：在方法正常结束后执行的代码
	//可以访问到方法的返回值的 
	@AfterReturning(value="execution(public int com.sut.gt.aop.impl.ArithmeticCalculator.*(..))", returning="result")
	public void afterRunning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The mehtod " + methodName +" ends with " + result);
	}
	
	@AfterThrowing(value="execution(public int com.sut.gt.aop.impl.ArithmeticCalculator.*(..))", throwing="ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The mehtod " + methodName +" occurs Exception: " + ex);
	}*/
	
	@Around("declareJoinPointExpression()")
	public Object aroundMethod(ProceedingJoinPoint pjt ) {
		Object result = null;
		String methodName = pjt.getSignature().getName();
		List<Object> list = Arrays.asList(pjt.getArgs());
		//执行目标方法
		try {
			//前置通知
			
			System.out.println("The mehtod " + methodName +" begins with " + list);

			result = pjt.proceed();
			//后置通知
			System.out.println("The mehtod " + methodName +" ends");
		} catch (Throwable e) {
			// 异常通知
			System.out.println("The mehtod " + methodName +" occurs Exception: " + e);
			throw new RuntimeException(e);
		}
		
		//后置通知
		System.out.println("The mehtod " + methodName +" ends with " + result);
		return result;
		
	}

}
