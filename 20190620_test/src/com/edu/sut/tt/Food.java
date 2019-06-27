package com.edu.sut.tt;

public class Food {

	private String foodName;
	private double num;
	private double price;
	
	public Food(String foodName,double num,double price){
		this.foodName = foodName;
		this.num = num;
		this.price = price;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return foodName+",spend $"+price;
	}
	
}
