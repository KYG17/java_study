package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.startEngine();
		
		int speed =myCar.checkSpeed();
		System.out.println("기본 속도는 " + speed + " km/h입니다");
		
		myCar.setSpeed(20);
		
		String result = myCar.Destination("서울");
		System.out.println(result);
	}

}
