package com.edu.sut.tys.factory;

import com.edu.sut.tys.car.BenCar;
import com.edu.sut.tys.car.BydCar;
import com.edu.sut.tys.car.Car;
import com.edu.sut.tys.car.TorCar;

public class CarFactory {

	public Car creatCar(String type) {
		
		if (type.equals("byd")) {
			return new BydCar();
		}else if(type.equals("ben")){
			return new BenCar();
		}else{
			return new TorCar();
		}	
	}
}
