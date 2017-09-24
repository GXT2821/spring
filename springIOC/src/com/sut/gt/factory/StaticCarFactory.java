package com.sut.gt.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法
 */

public class StaticCarFactory {
	private static Map<String, Car> map = new HashMap<String, Car>();
	
	static {
		map.put("Audi", new Car("Audi", 300000));
		map.put("ford", new Car("ford", 400000));
	}
	
	//静态工厂方法
	public static Car getCar(String name) {
		return map.get(name);
	}

}
