package com.sut.gt.helloworld;

import com.sut.gt.aop.impl.ArithmeticCalculator;
import com.sut.gt.aop.impl.ArithmeticCalculatorImp;

public class Test {
	public static void main(String[] args) {
		ArithmeticCalculator target = new ArithmeticCalculatorImp();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		int result = proxy.add(1, 3);
		System.out.println("-->" + result);
		
		result = proxy.div(4, 2);
		System.out.println("-->" + result);
	}

}
