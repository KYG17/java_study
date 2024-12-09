package Practice03.controller;

import Practice03.model.vo.Bicycle;
import Practice03.model.vo.Car;
import Practice03.model.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		
	
	
	Vehicle v1 = new Car();
	Vehicle v2 = new Bicycle();
	
	
	v1.go();
	v2.go();
	}

}
