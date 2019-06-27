package com.edu.sut.tt;

public class People {

	private String name;
	private String sex;
	
	public People(String name,String sex) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.sex = sex;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void buy() {
		System.out.print(" buy ");
	}
}
