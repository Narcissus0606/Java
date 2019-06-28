package com.edu.sut.tys.bean;

import java.sql.Date;

public class Food extends Object implements Cloneable{

	public Food(){
		
	}
	//当前类中只有属性，没有行为
	//只提供get和set方法，我们把这种类叫做实体bean
	
	private String barCode;
	private Date date;
	private double price;
	
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public Object clone(){
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
