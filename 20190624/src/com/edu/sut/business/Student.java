package com.edu.sut.business;

public class Student {

	private String ID;
	private String SEX;
	
	public Student(){
		
	}
	
	public Student(String ID,String SEX){
		this.ID = ID;
		this.SEX = SEX;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSEX() {
		return SEX;
	}

	public void setSEX(String sEX) {
		SEX = sEX;
	}
	
	
	public void learn() {
		System.out.println("I want to learn!");
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", SEX=" + SEX + "]";
	}

	
	
}
