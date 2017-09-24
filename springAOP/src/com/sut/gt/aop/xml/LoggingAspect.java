package com.sut.gt.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspect {
	
	public void beforeMethod(JoinPoint joinPoint) {
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The mehtod " + methodName +" begins with " + list);
	}
	
	
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The mehtod " + methodName +" ends");
	}
	
	public void afterRunning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The mehtod " + methodName +" ends with " + result);
	}
	

	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The mehtod " + methodName +" occurs Exception: " + ex);
	}
	
	
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
