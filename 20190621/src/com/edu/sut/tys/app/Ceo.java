package com.edu.sut.tys.app;

public class Ceo {
	
	private Ceo(){
		
	}
	
	private static Ceo ceo = new Ceo();
	
	public static Ceo getInstance() {
		
		return ceo;
	}
	
}