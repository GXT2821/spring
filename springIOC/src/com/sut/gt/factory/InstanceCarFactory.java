package com.sut.gt.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法
 */
public class InstanceCarFactory {
	
	private Map<String, Car> map = null;
	
	public InstanceCarFactory() {
		map = new HashMap<String, Car>();
		map.put("Audi", new Car("Audi", 300000));
		map.put("ford", new Car("ford", 400000));
	}
	
	public Car getCar(String name) {
		return map.get(name);
	}

}
