package org.classObject;

public class Hello {

	public static void main(String[] args) {
		
		Car car = new Car();		//default constructor
		Car carParameter = new Car("Closed", "On", "Seated", 50);
		/*
		car.setSpeed(40);
		System.out.println(car.getSpeed());
		
		car.setDoors("Closed");
		System.out.println(car.getDoors());
		car.setDriver("Seated");
		car.setEngine("On");
		*/
		System.out.println(car.run());
		System.out.println(carParameter.run());
		

	}

}
