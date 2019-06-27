package com.edu.sut.tt.app;

public class People {

	private String id;
	private String sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void eat() {
		System.out.println("People eat!");
	}
	
}
