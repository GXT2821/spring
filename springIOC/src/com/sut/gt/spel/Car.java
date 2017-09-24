package com.sut.gt.spel;

public class Car {
	private String brand;
	private double price;
	private double l; //轮胎周长
	
	
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", l=" + l + "]";
	}
	
	
	
	

}
