package com.edu.sut.tys.main;

import com.edu.sut.tys.app.Ceo;
import com.edu.sut.tys.bean.Food;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ceo ceo1 = Ceo.getInstance();
		System.out.println(ceo1);
		
		Ceo ceo2 = Ceo.getInstance();
		System.out.println(ceo2);*/
		
		
		Food f1 = new Food();
		System.out.println(f1);
		Food f2 = (Food)f1.clone();
		System.out.println(f2);
		
		
	}

}
