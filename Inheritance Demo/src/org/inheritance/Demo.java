package org.inheritance;

import inheritanceChild.Bike;
import inheritanceChild.Car;
import inheritanceChild.Tempoo;
import inheritanceChild.Truck;

public class Demo {

	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());	//we can access parent class method in this main method
		System.out.println();
		Bike bike1 = new Bike("long", "petrol", 2, 2, 15, "LED");
//		System.out.println(bike1.getHandle());
//		System.out.println(bike1.getEngine());
//		System.out.println(bike1.getSeats());
//		System.out.println(bike1.getFuelTank());
//		System.out.println(bike1.getLights());
//		System.out.println(bike1.getWheels());
//		if we print just object 
		System.out.println(bike1);	
		System.out.println("Now Run mehod will also call toString method");
		bike1.run();
		/*Car Class*/System.out.println();
		System.out.println("+++++++++++++++CAR OBJECT STARTS++++++++++++++++++++");
		Car carObject1 = new Car();
		carObject1.run();
//		System.out.println(carObject1);
		
//		Car carObject0224 = new Car(steering, "Sony", "Mitsubishi", "Apple I Pad");
		Car carObject0224 = new Car("PowerSteering", "Sony", "Mitsubishi", "Apple I Pad", "Petrol", 4, 4, 30, "LED");
		System.out.println(carObject0224);
		
		/*Truck Class*/System.out.println();
		System.out.println("-------WORKING ON TRUCK OBJECT---------");
//		Truck truckObject0111 = new Truck("Manual", "Radio", "Absent Air Conditioner", "500", "Diesel", "8", "3", "50", "Heavy Light");
		Truck truckObject0111 = new Truck("Manual", "Radio", "Absent Air Conditioner", "500KG", "Diesel", 8, 3, 50, "Heavy Light");
		System.out.println(truckObject0111);
		
		/*Tempoo Class*/System.out.println();
		System.out.println("**************WORKING ON TEMPOO OBJECT**************");
		Tempoo tempooObject4 = new Tempoo("PowerSteering", "Sony", "Samsung", "200KG", "Diesel", 4, 3, 40, "LED", "Samll Carry");
		System.out.println(tempooObject4.showData());
		
		
		//Bike b = new Vehicle();	//Vehicle cannot be resolved to a type
	}

}
