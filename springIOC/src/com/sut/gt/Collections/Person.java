package com.sut.gt.Collections;

import java.util.List;

import com.sut.gt.test.Car;

public class Person {
	
	private String name;
	private int age;
	private List<Car> car;
	
	
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
	
	
	

}
